package com.ruanko.hlearning.login.service.impl;



import com.ruanko.hlearning.login.dao.LogininfoMapper;
import com.ruanko.hlearning.login.service.LogininfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Project Name:springboot_mybatis_demo <br/>
 * Package Name:com.nasus.mybatis.service <br/>
 * Date:2019/2/18 0018 15:10 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="mailto:chenzy@eastcom-sw.com">chenzy</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2019 =======================================================
 */
/* 实现类：实现我们的接口 */

@Service
public class LogininfoServiceImpl implements LogininfoService {

    @Autowired
    private LogininfoMapper studentMapper;

//    /**
//     * 登录 admininfo
//     * @param loginnum,pwd
//     * @return
//             */
//    @Override
//    public int AdminLogin(String loginnum,String pwd) {
//        return studentMapper.AdminLogin(loginnum,pwd);
//    }
//
//    /**
//     * 登录 staffinfo
//     * @param jobnum,pwd
//     * @return
//     */
//    @Override
//    public int StaffLogin(String jobnum,String pwd) {
//        return studentMapper.StaffLogin(jobnum,pwd);
//    }
//
//
//    /**
//     * 注册 staff
//     * @param staffinfo 借阅记录
//     * @return
//     */
//    @Override
//    public int Register(Staffinfo staffinfo) {
//        return studentMapper.Register(staffinfo);
//    }
//
//
//    /**
//     * 查询 state
//     * @param jobnum 借阅记录
//     * @return
//     */
//    @Override
//    public int StaffLoginState(String jobnum) {
//        return studentMapper.StaffLoginState(jobnum);
//    }
//
//    @Override
//    public int AdminLoginState(String loginnum) {
//        return studentMapper.AdminLoginState(loginnum);
//    }
//
//
//    /**
//     * 查找 staffinfo
//     * @param jobnum 工号
//     * @return
//     */
//    @Override
//    public int findStaff(String jobnum) {
//        return studentMapper.findStaff(jobnum);
//    }
//
//
//    /**
//     * 查找 logininfo
//     * @param jobnum 工号
//     * @return
//     */
//    @Override
//    public int findLogin(String jobnum) {
//        return studentMapper.findLogin(jobnum);
//    }
//
//
//    /**
//     * 查找 name
//     * @param loginnum 工号
//     * @return
//     */
//    @Override
//    public String findAdminName(String loginnum) {
//        return studentMapper.findAdminName(loginnum);
//    }
//
//
//    /**
//     * 查找 id
//     * @param loginnum 工号
//     * @return
//     */
//    @Override
//    public int findAdminId(String loginnum) {
//        return studentMapper.findAdminId(loginnum);
//    }
//
//    /**
//     * 查找 name
//     * @param jobnum 工号
//     * @return
//     */
//    @Override
//    public String findStaffName(String jobnum) {
//        return studentMapper.findStaffName(jobnum);
//    }
//
//
//    /**
//     * 查找 id
//     * @param jobnum 工号
//     * @return
//     */
//    @Override
//    public int findStaffId(String jobnum) {
//        return studentMapper.findStaffId(jobnum);
//    }


}
