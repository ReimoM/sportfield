package com.sports.sportfield.service.customer.image;

import com.sports.sportfield.domain.picturefield.PictureFieldDto;
import com.sports.sportfield.domain.picturefield.PictureFieldService;
import com.sports.sportfield.service.customer.bookings.NewFieldBookingDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/image")
public class ImageController {
    @Resource
    private PictureFieldService pictureFieldService;

    @PostMapping("/new")
    @Operation(summary = "Lisa pilt")
    public void addImage(@Valid @RequestBody PictureFieldDto request ) {
        pictureFieldService.addImage(request);
    }

}
