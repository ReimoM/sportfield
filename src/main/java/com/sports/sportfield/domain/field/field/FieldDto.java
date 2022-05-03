package com.sports.sportfield.domain.field.field;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class FieldDto implements Serializable {
    private Integer id;
    private Integer locationId;
    private String locationCounty;
    private BigDecimal locationLatitude;
    private BigDecimal locationLongitude;
    private String name;
    private Boolean isActive;
}
