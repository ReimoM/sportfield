package com.sports.sportfield.domain.picture;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PictureService {

    @Resource
    private PictureMapper pictureMapper;

    @Resource
    private PictureRepository pictureRepository;

    public PictureDto addNewPicture(PictureDto pictureDto) {
        Picture picture = pictureMapper.toEntity(pictureDto);
        pictureRepository.save(picture);
        return pictureMapper.toDto(picture);

    }
}
