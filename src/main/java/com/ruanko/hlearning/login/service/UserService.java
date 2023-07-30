package com.ruanko.hlearning.login.service;

import com.ruanko.hlearning.login.entity.User;

public interface UserService {

    //根据用户名和密码来查找用户信息
    User userByNameAndPwd(User user);
}
