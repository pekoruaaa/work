package com.ruanko.hlearning.teacher.controller;

import com.ruanko.hlearning.teacher.entity.Teacher;
import com.ruanko.hlearning.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
public class TeacherController {

    @Autowired
    private TeacherService teacherService;

    @RequestMapping("/information")
    public String information(Model model){
        Teacher teacher = teacherService.findInfo();
        model.addAttribute("teacher",teacher);
        return "system/teacher/teacher";
    }

    @RequestMapping("/updateInfo")
    public String updateInfo(Teacher teacher, Model model, HttpServletResponse res) throws IOException {
        int result = teacherService.updateInfo(teacher);
        Teacher teacher1 = teacherService.findInfo();
        model.addAttribute("teacher",teacher1);
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        if(result > 0){
            out.print("<script>alert('修改成功！');</script>");
            out.flush();
        }else{
            out.print("<script>alert('修改失败！');</script>");
            out.flush();
        }
        model.addAttribute("teacher",teacher);
        return "system/teacher/teacher";
    }

    @RequestMapping("/updatePwd")
    public String updatePwd(int tc_id1,String tc_pwd,String zpwd, Model model, HttpServletResponse res) throws IOException {
        Teacher teacher1 = teacherService.findInfo();
        model.addAttribute("teacher",teacher1);
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        String pwd = teacherService.findPwd(tc_id1);
        if(pwd.equals(tc_pwd)==false){
            out.print("<script>alert('密码错误！');</script>");
            out.flush();
            return "system/teacher/teacher";
        }
        Teacher teacher = new Teacher();
        teacher.setTc_id(tc_id1);
        teacher.setTc_password(zpwd);
        int result = teacherService.updatePwd(teacher);
        if(result > 0){
            out.print("<script>alert('修改成功！');</script>");
            out.flush();
        }else{
            out.print("<script>alert('修改失败！');</script>");
            out.flush();
        }
        return "system/teacher/teacher";
    }

    @RequestMapping("/delete")
    public String delete(int id, Model model, HttpServletResponse res) throws IOException {
        int result = teacherService.delete(id);
        Teacher teacher1 = teacherService.findInfo();
        model.addAttribute("teacher",teacher1);
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        if(result > 0){
            out.print("<script>alert('注销成功！');</script>");
            out.flush();
        }else{
            out.print("<script>alert('注销失败！');</script>");
            out.flush();
        }
        return "index";
    }

}
