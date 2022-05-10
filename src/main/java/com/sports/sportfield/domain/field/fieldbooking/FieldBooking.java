package com.sports.sportfield.domain.field.fieldbooking;

import com.sports.sportfield.domain.booking.Booking;
import com.sports.sportfield.domain.sportsfield.SportsField;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "field_booking")
public class FieldBooking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "booking_id", nullable = false)
    private Booking booking;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sports_field_id", nullable = false)
    private SportsField sportsField;

    @Column(name = "date", nullable = false)
    private LocalDate date;

    @Column(name = "start_time_hour", nullable = false)
    private Integer startTimeHour;

    @Column(name = "end_time_hour", nullable = false)
    private Integer endTimeHour;
}