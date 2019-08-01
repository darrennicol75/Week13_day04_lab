package com.codeclan.example.courseservice.controllers;


import com.codeclan.example.courseservice.models.Course;
import com.codeclan.example.courseservice.models.Customer;
import com.codeclan.example.courseservice.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/course")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/{rating}")
    public List<Course> getCourseByRating(@PathVariable int rating){
        return courseRepository.getCourseByRating(rating);
    }


}
