package com.sports.sportfield.domain.location;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class LocationDto implements Serializable {
    private Integer id;
    private String county;
    private BigDecimal latitude;
    private BigDecimal longitude;
}
