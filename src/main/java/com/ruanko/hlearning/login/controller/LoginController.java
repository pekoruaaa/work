package com.ruanko.hlearning.login.controller;

import com.ruanko.hlearning.login.entity.Admin;
import com.ruanko.hlearning.login.entity.User;
import com.ruanko.hlearning.login.service.AdminService;
import com.ruanko.hlearning.login.service.UserService;
import com.ruanko.hlearning.teacher.entity.Teacher;
import com.ruanko.hlearning.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class LoginController {

    @Autowired
    private AdminService adminService;
    @Autowired
    private TeacherService teacherService;
    @Autowired
    private UserService userService;

    //显示首页
    @RequestMapping("/")
    public String index(){
        return "index";
    }

    //显示注册界面
    @RequestMapping("/toRegister")
    public String toRegister(){
        return "system/login/register";
    }

    //注册
    @RequestMapping("/register")
    public String Register(){
        return "/";
    }

    //退出登陆
    @RequestMapping("/tologin")
    public String tologin(){
        return "index";
    }

    //登陆
    @RequestMapping("/login")
    public String login(HttpServletRequest req, HttpSession session, HttpServletResponse response)throws IOException {
        response.setContentType("text/html;charset=utf-8");
        String username=req.getParameter("username");
        String password=req.getParameter("password");
        int role=Integer.parseInt(req.getParameter("role"));
        PrintWriter out=response.getWriter();
        User userResult = null;
        Teacher teaResult=null;
        Admin adminResult=null;
        if(role==1){
            User user = new User();
            user.setUser_name(username);
            user.setUser_password(password);
            userResult = userService.userByNameAndPwd(user);
            if(userResult!=null){
                session.setAttribute("username",userResult.getUser_name());
                session.setAttribute("id",userResult.getUser_id());
//                model.addAttribute("username",username);
//                out.println("<script type='text/javascript'>"+"alert('登录成功!');"
//                        +"</script>");
                return "user_index";
            }else{
                out.println("<script type='text/javascript'>"+"alert('登录失败!');"
                        +"</script>");
                return "index";
            }
        }else if(role==2){
            Teacher tea = new Teacher();
            tea.setTc_name(username);
            tea.setTc_password(password);
            teaResult = teacherService.teacherByNameAndPwd(tea);
            if(teaResult!=null){
                session.setAttribute("username",teaResult.getTc_name());
                session.setAttribute("id",teaResult.getTc_id());
//                model.addAttribute("username",username);
//                out.println("<script type='text/javascript'>"+"alert('登录成功!');"
//                        +"</script>");
                return "teacher_index";
            }else{
                out.println("<script type='text/javascript'>"+"alert('登录失败!');"
                        +"</script>");
                return "index";
            }
        }else{
            Admin admin = new Admin();
            admin.setMg_name(username);
            admin.setMg_password(password);
            adminResult = adminService.adminByNameAndPwd(admin);
            if(adminResult!=null){
                session.setAttribute("username",adminResult.getMg_name());
                session.setAttribute("id",adminResult.getMg_id());
//                model.addAttribute("username",username);
//                out.println("<script type='text/javascript'>"+"alert('登录成功!');"
//                        +"</script>");
                return "home";
            }else{
                out.println("<script type='text/javascript'>"+"alert('登录失败!');"
                        +"</script>");
                return "index";
            }
        }
    }


}
