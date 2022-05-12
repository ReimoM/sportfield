package com.sports.sportfield.domain.field.fieldbooking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface FieldBookingRepository extends JpaRepository<FieldBooking, Integer> {
    @Query("select f from FieldBooking f where f.sportsField.id = :id and f.date = :date")
    List<FieldBooking> findFieldBookings(@Param("id") Integer sportsFieldId, @Param("date") LocalDate date);

    @Query("select f from FieldBooking f where f.booking.user.id = ?1")
    List<FieldBooking> findByUserId(Integer id);

    @Query("select f from FieldBooking f where f.booking.user.id = ?1")
    List<FieldBooking> findByBooking_User_Id(Integer id);


    void deleteById(FieldBooking id);
}