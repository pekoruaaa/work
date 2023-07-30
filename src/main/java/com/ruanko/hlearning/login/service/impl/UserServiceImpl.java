package com.ruanko.hlearning.login.service.impl;

import com.ruanko.hlearning.login.entity.User;
import com.ruanko.hlearning.login.mapper.UserMapper;
import com.ruanko.hlearning.login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    //根据用户名和密码来查找用户信息
    public User userByNameAndPwd(User user){
        User result =userMapper.userByNameAndPwd(user);
        return result;
    }
}
