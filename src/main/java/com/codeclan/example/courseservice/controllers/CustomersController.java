package com.codeclan.example.courseservice.controllers;


import com.codeclan.example.courseservice.models.Course;
import com.codeclan.example.courseservice.models.Customer;
import com.codeclan.example.courseservice.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customers")
public class CustomersController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/customer/{course_id}")
    public List<Customer> getCustomerByCourse(@PathVariable Long course_id){
        return customerRepository.getCustomerByCourse(course_id);
    }

    @GetMapping(value = "/courses/{customer_id}")
    public List<Course> getCoursesrByCustomer(@PathVariable Long customer_id){
        return customerRepository.getCourseByCustomer(customer_id);
    }

}
