package com.ruanko.hlearning.teacher.mapper;


import com.ruanko.hlearning.teacher.entity.Course;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CourseMapper {

    List<Course> findAllCourses();

    List<Course> findAllWaitCourses();

    List<Course> findCourses(Course course);

    List<Course> findWaitCourses(Course course);

    int addCourse(Course course);

    int deleteCourse(int id);

    int updateCourse(Course course);

}
