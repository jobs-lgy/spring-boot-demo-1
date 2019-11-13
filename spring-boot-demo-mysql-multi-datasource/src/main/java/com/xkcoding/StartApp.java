package com.xkcoding.multi.datasource.mybatis;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@MapperScan(basePackages = "com.xiaobin.mapper")
@Import({DynamicDataSourceConfig.class})
public class StartApp {
  public static void main(String[] args) {
    SpringApplication.run(StartApp.class);
  }
}
