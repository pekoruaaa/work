package com.ruanko.hlearning.teacher.mapper;

import com.ruanko.hlearning.teacher.entity.Teacher;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TeacherMapper {

    Teacher findInfo();

    String findPwd(int id);

    int updateInfo(Teacher teacher);

    int updatePwd(Teacher teacher);

    int delete(int id);

    //根据用户名和密码来查找教师信息
    Teacher teacherByNameAndPwd(Teacher teacher);
}
