package com.ruanko.hlearning.login.service;

import com.ruanko.hlearning.login.entity.Admin;

public interface AdminService {

    //根据用户名和密码来查找管理员信息
    Admin adminByNameAndPwd(Admin admin);
}
