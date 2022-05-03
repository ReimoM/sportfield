package com.sports.sportfield.domain.field.fieldavailability;

import com.sports.sportfield.domain.field.field.Field;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "field_availability")
public class FieldAvailability {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "field_id", nullable = false)
    private Field field;

    @Column(name = "weekday")
    private Integer weekday;

    @Column(name = "start_time_hour")
    private Integer startTimeHour;

    @Column(name = "end_time_hour")
    private Integer endTimeHour;

    @Column(name = "holiday")
    private LocalDate holiday;

    @Column(name = "is_open", nullable = false)
    private Boolean isOpen = false;

}