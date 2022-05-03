package com.sports.sportfield.domain.field.fieldavailability;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface FieldAvailabilityRepository extends JpaRepository<FieldAvailability, Integer> {


    @Query("select f from FieldAvailability f where f.field.id = ?1")
    List<FieldAvailability> findByFieldId(Integer id);

    @Query("select f from FieldAvailability f where f.field.id = ?1 and f.weekday = ?2")
    Optional<FieldAvailability> findWeekdayAvailability(Integer fieldId, Integer weekdayNumber);

    @Query("select f from FieldAvailability f where f.field.id = ?1 and f.holiday = ?2")
    Optional<FieldAvailability> findHolidayAvailability(Integer id, LocalDate holiday);

    @Query("select f from FieldAvailability f where f.holiday = ?1")
    Optional<FieldAvailability> findByHoliday(LocalDate holiday);

    @Query("select f from FieldAvailability f where f.field.id = ?1 and f.weekday = ?2 and f.isOpen = ?3")
    Optional<FieldAvailability> findByIsOpen(Integer id, Integer weekday, Boolean isOpen);
















}