package com.ruanko.hlearning.teacher.service;

import com.ruanko.hlearning.teacher.entity.Teacher;

public interface TeacherService {

    Teacher findInfo(int id);

    String findPwd(int id);

    int updateInfo(Teacher teacher);

    int updatePwd(Teacher teacher);

    int delete(int id);

    //根据用户名和密码来查找教师信息
    Teacher teacherByNameAndPwd(Teacher teacher);
}
