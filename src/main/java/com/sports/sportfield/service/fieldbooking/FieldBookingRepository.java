package com.sports.sportfield.service.fieldbooking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface FieldBookingRepository extends JpaRepository<FieldBooking, Integer> {
    List<FieldBooking> findBySportsFieldIdAndDate(Integer id, LocalDate date);


}