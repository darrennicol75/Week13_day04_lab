package com.codeclan.example.courseservice.repositories.BookingRepository;


import com.codeclan.example.courseservice.models.Booking;

import java.util.List;

public interface BookingRepositoryCustom {

    List<Booking> getBookingByDate(String date);

}
