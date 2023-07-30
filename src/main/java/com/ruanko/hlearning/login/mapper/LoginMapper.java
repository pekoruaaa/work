package com.ruanko.hlearning.login.mapper;


import com.ruanko.hlearning.login.entity.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginMapper {

    List<Course> findAllCourses();
}
