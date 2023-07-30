package com.ruanko.hlearning.teacher.service;


import com.ruanko.hlearning.teacher.entity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CourseService {

    List<Course> findAllCourses();

    List<Course> findAllWaitCourses();

    List<Course> findCourses(Course course);

    List<Course> findWaitCourses(Course course);

    int addCourse(Course course);

    int deleteCourse(int id);

    int updateCourse(Course course);
}
