package com.sports.sportfield.service.fieldbooking;

import com.sports.sportfield.domain.sportsfield.SportsField;
import lombok.Data;

import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;

@Data
public class FieldBookingRequest {

    @NotNull
    private SportsField id;

    @NotNull
    @Size (min = 1, max = 24)
    private Integer startTime;

    @NotNull
    @Size (min = 1, max = 24)
    private Integer endTime;

    @NotNull
    private Date date;


}
