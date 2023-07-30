package com.ruanko.hlearning.teacher.service.impl;


import com.ruanko.hlearning.teacher.entity.Course;
import com.ruanko.hlearning.teacher.mapper.CourseMapper;
import com.ruanko.hlearning.teacher.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseMapper courseMapper;

    public List<Course> findAllCourses(){
        List<Course> results = courseMapper.findAllCourses();
        return results;
    }

    public List<Course> findAllWaitCourses(){
        List<Course> results = courseMapper.findAllWaitCourses();
        return results;
    }

    public List<Course> findCourses(Course course){
        List<Course> results = courseMapper.findCourses(course);
        return results;
    }

    public List<Course> findWaitCourses(Course course){
        List<Course> results = courseMapper.findWaitCourses(course);
        return results;
    }

    public int addCourse(Course course) {
        int result = courseMapper.addCourse(course);
        return result;
    }

    public int deleteCourse(int id) {
        int result = courseMapper.deleteCourse(id);
        return result;
    }

    public int updateCourse(Course course) {
        int result = courseMapper.updateCourse(course);
        return result;
    }
}
