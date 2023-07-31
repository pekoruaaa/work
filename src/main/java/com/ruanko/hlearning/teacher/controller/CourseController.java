package com.ruanko.hlearning.teacher.controller;


import com.ruanko.hlearning.teacher.entity.Course;
import com.ruanko.hlearning.teacher.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
public class CourseController {

    @Autowired
   private CourseService courseService;

    @RequestMapping("/courselist")
    public String findAllCourses(Model model){
        List<Course> results = courseService.findAllCourses();
        model.addAttribute("courses",results);
        return "system/teacher/course/courselist";
    }

    @RequestMapping("/waitCourseList")
    public String findAllWaitCourses(Model model){
        List<Course> results = courseService.findAllWaitCourses();
        System.out.println(results);
        model.addAttribute("courses",results);
        return "system/teacher/course/waitCourseList";
    }

    @RequestMapping("/findCourses")
    public String findCourses(String option, String value, Model model) {
        Course course = new Course();
        if(value.equals("")){
            return "redirect:courselist";
        }
        if(option.equals("cs_id")){
            course.setCs_id(Integer.parseInt(value));
        }else if(option.equals("cs_name")){
            course.setCs_name(value);
        }else if(option.equals("cs_type")){
            course.setCs_type(value);
        }
        System.out.println(course);
        List<Course> results = courseService.findCourses(course);
        model.addAttribute("courses",results);
        return "system/teacher/course/courselist";
    }

    @RequestMapping("/findWaitCourses")
    public String findWaitCourses(String option, String value, Model model) {
        Course course = new Course();
        if(value.equals("")){
            return "redirect:waitCourseList";
        }
        if(option.equals("cs_id")){
            course.setCs_id(Integer.parseInt(value));
        }else if(option.equals("cs_name")){
            course.setCs_name(value);
        }else if(option.equals("cs_type")){
            course.setCs_type(value);
        }
        System.out.println(course);
        List<Course> results = courseService.findWaitCourses(course);
        model.addAttribute("courses",results);
        return "system/teacher/course/waitCourseList";
    }

    @RequestMapping("/toAdd")
    public String toAdd(Model model){
        System.out.println(1111111111);
        return "system/teacher/course/addCourse";
    }

    @RequestMapping("/addCourse")
    public String addCourse(String cs_name,String cs_type,String cs_url,Model model, HttpServletResponse res) throws IOException {
        Course course = new Course();
        course.setCs_name(cs_name);
        course.setCs_type(cs_type);
        course.setCs_url(cs_url);
        course.setCs_tcid(1);
        System.out.println(course);
        int result = courseService.addCourse(course);
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        if(result > 0){
            out.print("<script>alert('添加成功！');</script>");
            out.flush();
        }else{
            out.print("<script>alert('添加失败！');</script>");
            out.flush();
        }
        return "system/teacher/course/addCourse";
    }

    @RequestMapping("/deleteCourse")
    public String deleteCourse(int id,Model model,HttpServletResponse res) throws IOException{
        int result = courseService.deleteCourse(id);
        List<Course> results = courseService.findAllCourses();
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        if(result > 0){
            out.print("<script>alert('删除成功！');</script>");
            out.flush();
        }else{
            out.print("<script>alert('删除失败！');</script>");
            out.flush();
        }
        model.addAttribute("courses",results);
        return "system/teacher/course/courselist";
    }

    @RequestMapping("/toUpdate")
    public String toUpdate(int id,Model model){
        model.addAttribute("cs_id",id);
        System.out.println(1111111111);
        return "system/teacher/course/updateCourse";
    }

    @RequestMapping("/updateCourse")
    public String updateCourse(int cs_id,String cs_name,String cs_type,String cs_url,Model model,HttpServletResponse res) throws IOException{
        System.out.println(2222222);
        Course course = new Course();
        course.setCs_id(cs_id);
        course.setCs_name(cs_name);
        course.setCs_type(cs_type);
        course.setCs_url(cs_url);
        System.out.println(course);
        int result = courseService.updateCourse(course);
        List<Course> results = courseService.findAllCourses();
        res.setContentType("text/html;charset=utf-8");
        PrintWriter out = res.getWriter();
        if(result > 0){
            out.print("<script>alert('修改成功！');</script>");
            out.flush();
        }else{
            out.print("<script>alert('修改失败！');</script>");
            out.flush();
        }
        model.addAttribute("courses",results);
        return "system/teacher/course/courselist";
    }

}
