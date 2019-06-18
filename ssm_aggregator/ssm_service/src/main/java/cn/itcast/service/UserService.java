package cn.itcast.service;

import cn.itcast.domain.User;

import java.util.List;

/**
 * @author 王波
 * @version V1.0
 * @date 2019/6/15 19:58
 * @discription:
 */
public interface UserService {
    /**
     * 查询所有数据
     * @return
     */
    List<User> findAllUser();

    /**
     * 保存用户
     */
    void saveUser(User user);
}
