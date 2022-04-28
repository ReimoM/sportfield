package com.sports.sportfield.service.image;

import lombok.Data;

@Data
public class ImageResponse {
    private Integer fieldId;
    private String title;
    private String description;
    private String data;
}