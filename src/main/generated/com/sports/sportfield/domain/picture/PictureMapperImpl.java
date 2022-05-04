package com.sports.sportfield.domain.picture;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-04T15:38:47+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Amazon.com Inc.)"
)
@Component
public class PictureMapperImpl implements PictureMapper {

    @Override
    public Picture toEntity(PictureDto pictureDto) {
        if ( pictureDto == null ) {
            return null;
        }

        Picture picture = new Picture();

        picture.setId( pictureDto.getId() );
        byte[] pictureData = pictureDto.getPictureData();
        if ( pictureData != null ) {
            picture.setPictureData( Arrays.copyOf( pictureData, pictureData.length ) );
        }

        return picture;
    }

    @Override
    public PictureDto toDto(Picture picture) {
        if ( picture == null ) {
            return null;
        }

        PictureDto pictureDto = new PictureDto();

        pictureDto.setId( picture.getId() );
        byte[] pictureData = picture.getPictureData();
        if ( pictureData != null ) {
            pictureDto.setPictureData( Arrays.copyOf( pictureData, pictureData.length ) );
        }

        return pictureDto;
    }

    @Override
    public List<PictureDto> toDtos(List<Picture> picture) {
        if ( picture == null ) {
            return null;
        }

        List<PictureDto> list = new ArrayList<PictureDto>( picture.size() );
        for ( Picture picture1 : picture ) {
            list.add( toDto( picture1 ) );
        }

        return list;
    }

    @Override
    public void updateEntity(PictureDto pictureDto, Picture picture) {
        if ( pictureDto == null ) {
            return;
        }

        if ( pictureDto.getId() != null ) {
            picture.setId( pictureDto.getId() );
        }
        byte[] pictureData = pictureDto.getPictureData();
        if ( pictureData != null ) {
            picture.setPictureData( Arrays.copyOf( pictureData, pictureData.length ) );
        }
    }
}
