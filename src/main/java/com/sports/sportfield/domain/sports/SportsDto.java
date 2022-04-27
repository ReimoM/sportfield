package com.sports.sportfield.domain.sports;

import lombok.Data;

import java.io.Serializable;

@Data
public class SportsDto implements Serializable {
    private Integer id;
    private String sportsType;
}
