package com.sports.sportfield.domain.sportsfield;

import com.sports.sportfield.domain.field.field.Field;
import com.sports.sportfield.domain.sports.Sports;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "sports_field")
public class SportsField {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "field_id", nullable = false)
    private Field field;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "sports_id", nullable = false)
    private Sports sports;

}