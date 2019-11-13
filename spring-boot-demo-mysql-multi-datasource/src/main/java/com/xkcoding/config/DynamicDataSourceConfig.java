@Configuration
@Component
public class DynamicDataSourceConfig {

    @Bean
    @ConfigurationProperties("spring.datasource.druid.xiaobin-master")
    public DataSource  xiaobinMasterDataSource(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @ConfigurationProperties("spring.datasource.druid.xiaobin-slave")
    public DataSource  xiaobinSlaveDataSource(){
        return DruidDataSourceBuilder.create().build();
    }

    @Bean
    @Primary
    public DynamicDataSource dataSource(DataSource xiaobinMasterDataSource, DataSource xiaobinSlaveDataSource) {
        Map<Object, Object> targetDataSources = new HashMap<>();
        targetDataSources.put("xiaobin-master",xiaobinMasterDataSource);
        targetDataSources.put("xiaobin-slave", xiaobinSlaveDataSource);
        return new DynamicDataSource(xiaobinMasterDataSource, targetDataSources);
    }
}
