package com.sports.sportfield.domain.picture;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

@RestController
@RequestMapping("/picture")
public class PictureController {

    @Resource
    private PictureService pictureService;

    public PictureDto addNewPicture(@RequestBody @Valid PictureDto pictureDto) {
        return pictureService.addNewPicture(pictureDto);


    }
}
