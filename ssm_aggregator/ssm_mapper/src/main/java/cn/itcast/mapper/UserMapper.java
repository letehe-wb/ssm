package cn.itcast.mapper;

import cn.itcast.domain.User;

import java.util.List;

/**
 * @author 王波
 * @version V1.0
 * @date 2019/6/15 15:45
 * @discription:
 */

public interface UserMapper {

    /**
     * 查询所有用户
     * @return
     */
    List<User> findAllUser();

    /**
     * 保存用户
     * @param user
     */
    void saveUser(User user);
}
