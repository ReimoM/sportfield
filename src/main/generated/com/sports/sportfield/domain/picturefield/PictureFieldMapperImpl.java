package com.sports.sportfield.domain.picturefield;

import com.sports.sportfield.domain.field.field.Field;
import com.sports.sportfield.domain.picture.Picture;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-12T15:19:02+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 11.0.14.1 (Amazon.com Inc.)"
)
@Component
public class PictureFieldMapperImpl implements PictureFieldMapper {

    @Override
    public PictureField pictureFieldDtoToPictureField(PictureFieldDto pictureFieldDto) {
        if ( pictureFieldDto == null ) {
            return null;
        }

        PictureField pictureField = new PictureField();

        pictureField.setField( pictureFieldDtoToField( pictureFieldDto ) );
        pictureField.setPicture( pictureFieldDtoToPicture( pictureFieldDto ) );
        pictureField.setTitle( pictureFieldDto.getTitle() );

        return pictureField;
    }

    @Override
    public PictureFieldDto pictureFieldToPictureFieldDto(PictureField pictureField) {
        if ( pictureField == null ) {
            return null;
        }

        PictureFieldDto pictureFieldDto = new PictureFieldDto();

        pictureFieldDto.setFieldId( pictureFieldFieldId( pictureField ) );
        pictureFieldDto.setPictureId( pictureFieldPictureId( pictureField ) );
        pictureFieldDto.setTitle( pictureField.getTitle() );

        return pictureFieldDto;
    }

    @Override
    public void updatePictureFieldFromPictureFieldDto(PictureFieldDto pictureFieldDto, PictureField pictureField) {
        if ( pictureFieldDto == null ) {
            return;
        }

        if ( pictureField.getField() == null ) {
            pictureField.setField( new Field() );
        }
        pictureFieldDtoToField1( pictureFieldDto, pictureField.getField() );
        if ( pictureField.getPicture() == null ) {
            pictureField.setPicture( new Picture() );
        }
        pictureFieldDtoToPicture1( pictureFieldDto, pictureField.getPicture() );
        if ( pictureFieldDto.getTitle() != null ) {
            pictureField.setTitle( pictureFieldDto.getTitle() );
        }
    }

    protected Field pictureFieldDtoToField(PictureFieldDto pictureFieldDto) {
        if ( pictureFieldDto == null ) {
            return null;
        }

        Field field = new Field();

        field.setId( pictureFieldDto.getFieldId() );

        return field;
    }

    protected Picture pictureFieldDtoToPicture(PictureFieldDto pictureFieldDto) {
        if ( pictureFieldDto == null ) {
            return null;
        }

        Picture picture = new Picture();

        picture.setId( pictureFieldDto.getPictureId() );

        return picture;
    }

    private Integer pictureFieldFieldId(PictureField pictureField) {
        if ( pictureField == null ) {
            return null;
        }
        Field field = pictureField.getField();
        if ( field == null ) {
            return null;
        }
        Integer id = field.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private Integer pictureFieldPictureId(PictureField pictureField) {
        if ( pictureField == null ) {
            return null;
        }
        Picture picture = pictureField.getPicture();
        if ( picture == null ) {
            return null;
        }
        Integer id = picture.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    protected void pictureFieldDtoToField1(PictureFieldDto pictureFieldDto, Field mappingTarget) {
        if ( pictureFieldDto == null ) {
            return;
        }

        if ( pictureFieldDto.getFieldId() != null ) {
            mappingTarget.setId( pictureFieldDto.getFieldId() );
        }
    }

    protected void pictureFieldDtoToPicture1(PictureFieldDto pictureFieldDto, Picture mappingTarget) {
        if ( pictureFieldDto == null ) {
            return;
        }

        if ( pictureFieldDto.getPictureId() != null ) {
            mappingTarget.setId( pictureFieldDto.getPictureId() );
        }
    }
}
