package com.codeclan.example.courseservice.repositories.CustomerRepository;

import com.codeclan.example.courseservice.models.Course;
import com.codeclan.example.courseservice.models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {

    List<Customer> getCustomerByCourse(Long course_id);

    List<Course> getCourseByCustomer(Long customer_id);
}
