package com.sports.sportfield.service.fieldbooking;

import com.sports.sportfield.domain.field.Field;
import com.sports.sportfield.domain.sportsfield.SportsField;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Data
public class BookingRequirementInfo {
    private Integer sportsFieldId;
    private LocalDate date;

}
