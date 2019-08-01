package com.codeclan.example.courseservice.components;

import com.codeclan.example.courseservice.models.Booking;
import com.codeclan.example.courseservice.models.Course;
import com.codeclan.example.courseservice.models.Customer;
import com.codeclan.example.courseservice.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.courseservice.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.courseservice.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args){
        Course course1 = new Course("Codeclan", "Glasgow", 1);
        courseRepository.save(course1);

        Course course2 = new Course("Codebase", "Edinburgh", 10);
        courseRepository.save(course2);

        Customer customer1 = new Customer("Archie", "Glasgow", 32);
        customerRepository.save(customer1);

        Customer customer2 = new Customer("John", "Edinburgh", 36);
        customerRepository.save(customer2);

        Booking booking1 = new Booking("130920", course1, customer1);
        bookingRepository.save(booking1);

        Booking booking2 = new Booking("140920", course2, customer2);
        bookingRepository.save(booking2);

    }

}
