package com.codeclan.example.courseservice.repositories.CourseRepository;

import com.codeclan.example.courseservice.models.Course;

import java.util.List;

public interface CourseRepositoryCustom {

    List<Course> getCourseByRating(int rating);

}
