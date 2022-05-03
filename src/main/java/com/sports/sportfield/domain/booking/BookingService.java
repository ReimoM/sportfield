package com.sports.sportfield.domain.booking;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookingService {

    @Resource
    private BookingMapper bookingMapper;

    @Resource
    private BookingRepository bookingRepository;

    public void addNewBooking(Integer userId) {
        Booking booking = new Booking();
        booking.setId(userId);
        bookingRepository.save(booking);
    }
}
