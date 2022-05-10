package com.sports.sportfield.domain.picturefield;

import com.sports.sportfield.domain.field.field.Field;
import com.sports.sportfield.domain.picture.Picture;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "picture_field")
public class PictureField {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "field_id", nullable = false)
    private Field field;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "picture_id", nullable = false)
    private Picture picture;

    @Column(name = "title")
    private String title;

}