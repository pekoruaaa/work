package com.ruanko.hlearning.login.mapper;

import com.ruanko.hlearning.login.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    //根据用户名和密码来查找用户信息
    User userByNameAndPwd(User user);
}
