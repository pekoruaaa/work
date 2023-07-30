package com.ruanko.hlearning.teacher.service.impl;

import com.ruanko.hlearning.teacher.entity.Teacher;
import com.ruanko.hlearning.teacher.mapper.TeacherMapper;
import com.ruanko.hlearning.teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherMapper teacherMapper;

    public Teacher findInfo(){
        Teacher teacher = teacherMapper.findInfo();
        return teacher;
    }

    public String findPwd(int id){
        String pwd = teacherMapper.findPwd(id);
        return pwd;
    }

    public int updateInfo(Teacher teacher){
        int result = teacherMapper.updateInfo(teacher);
        return result;
    }

    public int updatePwd(Teacher teacher){
        int result = teacherMapper.updatePwd(teacher);
        return result;
    }

    public int delete(int id){
        int result = teacherMapper.delete(id);
        return result;
    }

    //根据用户名和密码来查找教师信息
    public Teacher teacherByNameAndPwd(Teacher teacher){
        Teacher result=teacherMapper.teacherByNameAndPwd(teacher);
        return result;
    }

}
