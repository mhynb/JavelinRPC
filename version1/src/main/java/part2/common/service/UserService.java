package part2.common.service;


import part2.common.pojo.User;

/**
 * @author mhynb
 * @version 1.0
 * @create 2024/1/28 16:27
 */
public interface UserService {
    // 客户端通过这个接口调用服务端的实现类
    User getUserByUserId(Integer id);
    //新增一个功能
    Integer insertUserId(User user);
}
