package com.sports.sportfield.domain.sportsfield;

import lombok.Data;

import java.io.Serializable;

@Data
public class SportsFieldDto implements Serializable {
    private final Integer id;
    private final Integer fieldId;
    private final String fieldName;
    private final Boolean fieldIsActive;
    private final Integer sportsId;
    private final String sportsSportsType;
}
