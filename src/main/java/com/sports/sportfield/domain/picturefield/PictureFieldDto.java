package com.sports.sportfield.domain.picturefield;

import lombok.Data;

import java.io.Serializable;

@Data
public class PictureFieldDto implements Serializable {
    private Integer pictureFieldId;
    private Integer fieldId;
    private Integer pictureId;
    private String title;
}
