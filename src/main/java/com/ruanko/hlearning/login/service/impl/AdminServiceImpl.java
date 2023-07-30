package com.ruanko.hlearning.login.service.impl;

import com.ruanko.hlearning.login.entity.Admin;
import com.ruanko.hlearning.login.mapper.AdminMapper;
import com.ruanko.hlearning.login.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private AdminMapper adminMapper;

    //根据用户名和密码来查找管理员信息
    public Admin adminByNameAndPwd(Admin admin){
        Admin result=adminMapper.adminByNameAndPwd(admin);
        return result;
    }
}
