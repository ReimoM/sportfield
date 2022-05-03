package com.sports.sportfield.domain.field.fieldavailability;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class FieldAvailabilityDto implements Serializable {
    private Integer id;
    private Integer fieldId;
    private Integer weekday;
    private Integer startTimeHour;
    private Integer endTimeHour;
    private LocalDate holiday;
    private Boolean isOpen;
}
