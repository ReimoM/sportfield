package com.sports.sportfield.domain.location;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "county", nullable = false, length = 50)
    private String county;

    @Column(name = "latitude", precision = 10, scale = 10)
    private BigDecimal latitude;

    @Column(name = "longitude", precision = 10, scale = 10)
    private BigDecimal longitude;

}