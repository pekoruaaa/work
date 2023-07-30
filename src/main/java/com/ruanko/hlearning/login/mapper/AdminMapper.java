package com.ruanko.hlearning.login.mapper;

import com.ruanko.hlearning.login.entity.Admin;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdminMapper {
    //根据用户名和密码来查找管理员信息
    Admin adminByNameAndPwd(Admin admin);
}
