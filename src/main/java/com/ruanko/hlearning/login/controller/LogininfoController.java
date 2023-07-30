package com.ruanko.hlearning.login.controller;



import com.ruanko.hlearning.login.service.LogininfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;

;

/**
 * Project Name:springboot_mybatis_demo <br/>
 * Package Name:com.nasus.mybatis.controller <br/>
 * Date:2019/2/18 0018 15:16 <br/>
 * <b>Description:</b> TODO: 描述该类的作用 <br/>
 *
 * @author <a href="mailto:chenzy@eastcom-sw.com">chenzy</a><br/>
 * Copyright Notice =========================================================
 * This file contains proprietary information of Eastcom Technologies Co. Ltd.
 * Copying or reproduction without prior written approval is prohibited.
 * Copyright (c) 2019 =======================================================
 */
@Controller

@RequestMapping("/user")
public class LogininfoController {

    @Autowired
    private LogininfoService logininfoService;

//    @GetMapping("/login")
//    public String login(){
//        return "system/login/login";
//    }
//
//    @GetMapping("/")
//    public String index(){
//        return "home";
//    }

//    @PostMapping("/tologin")
//    public String Login(HttpSession session, @RequestParam("jobnum") String jobnum, @RequestParam("pwd") String pwd){
//
//        if("admin".equals(jobnum)){
//            int a= logininfoService.AdminLogin(jobnum,pwd);
//            if(a==1){
//                int state= logininfoService.AdminLoginState(jobnum);
//                if(state==0){
//                String name = logininfoService.findAdminName(jobnum);
//                int id = logininfoService.findAdminId(jobnum);
//                session.setAttribute("user",name);
//                session.setAttribute("id",id);
//                return "home";
//                }else{
//                    return "system/login/loginfail";
//                    /*登陆失败*/
//                }
//            }else{
//                return "system/login/loginfail";
//                /*登陆失败*/
//            }
//        }else{
//            int a= logininfoService.StaffLogin(jobnum,pwd);
//            if(a==1){
//                int state= logininfoService.StaffLoginState(jobnum);
//                if(state==0){
//                    String name = logininfoService.findStaffName(jobnum);
//                    int id = logininfoService.findStaffId(jobnum);
//                    session.setAttribute("user",name);
//                    session.setAttribute("id",id);
//                    return "user_index";
//                }else if(state==1){
//                    return "system/login/failstate";
//                    /*用户不存在*/
//                }else{
//                    return "system/login/loginfailstate";
//                   /* 登陆失败,账号未审核*/
//                }
//            }else{
//                return "system/login/loginfail";
//                /*登陆失败*/
//            }
//        }
//
//    }
//
//    @GetMapping("/register")
//    public String register(){
//        return "system/login/register";
//    }
//
//    /* 注册学生页面 */
//    @PostMapping("/create")
//    public String createStaffinfo(@RequestParam("jobnum") String jobnum,@RequestParam("name") String name,@RequestParam("pwd") String pwd,@RequestParam("sex") String sex,
//                                  @RequestParam("age") int age,@RequestParam("phone") Long phone,@RequestParam("education") String education,@RequestParam("department") String department,
//                                  @RequestParam("post") String post) {
//        int a =  logininfoService.findStaff(jobnum);
//        if (a == 1 ) {
//            return "system/login/jobnumfail";
//        } else {
//            Date d = new Date();
//            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd kk:mm:ss ");
//            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
//            Staffinfo staffinfo = new Staffinfo();
//            staffinfo.setJobnum(jobnum);
//            staffinfo.setName(name);
//            staffinfo.setSex(sex);
//            staffinfo.setPhone(phone);
//            staffinfo.setAge(age);
//            staffinfo.setEducation(education);
//            staffinfo.setDepartment(department);
//            staffinfo.setPost(post);
//            staffinfo.setJointime(sd.format(d));
//            staffinfo.setPwd(pwd);
//            staffinfo.setState("2");
//            staffinfo.setCreator("admin");
//            staffinfo.setCreatetime(sdf.format(d));
//            logininfoService.Register(staffinfo);
//            int staff =  logininfoService.findStaff(jobnum);
//            if (staff ==1 ) {
//                return "system/login/loginwelcome";
//                /*注册成功,等待审核*/
//            } else {
//                return "system/login/registerfail";
//                /*注册失败*/
//            }
//        }
//    }
}
