@RestController
@RequestMapping
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/{name}/list")
    public List<TUser> list(@PathVariable("name")String name){
        if(name.equals("master")){
            return userMapper.queryAllWithMaster();
        }else{
            return userMapper.queryAllWithSlave();
        }
    }
}
