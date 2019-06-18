package cn.itcast.service.impl;

import cn.itcast.domain.User;
import cn.itcast.mapper.UserMapper;
import cn.itcast.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 王波
 * @version V1.0
 * @date 2019/6/15 19:59
 * @discription:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 保存用户
     */
    @Override
    public void saveUser(User user) {
        userMapper.saveUser(user);
    }

    @Override
    public List<User> findAllUser() {
        List<User> users = userMapper.findAllUser();
        return users;
    }
}
