package com.codeclan.example.courseservice.controllers;

import com.codeclan.example.courseservice.models.Booking;
import com.codeclan.example.courseservice.repositories.BookingRepository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/bookings")
public class BookingsController {

    @Autowired
    BookingRepository bookingRepository;

    @GetMapping(value = "/date/{date}")
    public List<Booking> getBookingByDate(@PathVariable String date){
        return bookingRepository.getBookingByDate(date); 
    }

}
