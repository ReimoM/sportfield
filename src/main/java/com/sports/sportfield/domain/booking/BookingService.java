package com.sports.sportfield.domain.booking;

import com.sports.sportfield.domain.user.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class BookingService {

    @Resource
    private BookingRepository bookingRepository;

    public Booking addNewBooking(User user) {
        Booking booking = new Booking();
        booking.setUser(user);
        bookingRepository.save(booking);
        return booking;
    }
}
