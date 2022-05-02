package com.sports.sportfield.domain.fieldavailability;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface FieldAvailabilityRepository extends JpaRepository<FieldAvailability, Integer> {


    @Query("select f from FieldAvailability f where f.field.id = ?1")
    List<FieldAvailability> findByFieldId(Integer id);

    @Query("select f from FieldAvailability f where f.field.id = ?1 and f.weekday = ?2")
    Optional<FieldAvailability> findByFieldIdAndWeekday(Integer fieldId, Integer weekdayNumber);

    @Query("select f from FieldAvailability f where f.field.id = ?1 and f.holiday = ?2")
    Optional<FieldAvailability> findAvailabilityByFieldIdAndHoliday(Integer id, LocalDate holiday);

    FieldAvailability findByHoliday(LocalDate holiday);













}