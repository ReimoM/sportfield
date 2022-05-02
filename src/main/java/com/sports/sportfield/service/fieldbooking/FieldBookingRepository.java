package com.sports.sportfield.service.fieldbooking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;

public interface FieldBookingRepository extends JpaRepository<FieldBooking, Integer> {
    @Query("select f from FieldBooking f where f.sportsField.field.id = ?1 and f.date = ?2")
    List<FieldBooking> findFieldBookings(Integer id, LocalDate date);
}