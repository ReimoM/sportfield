package com.sports.sportfield.domain.picturefield;

import org.mapstruct.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PictureFieldMapper {
    @Mapping(source = "fieldId", target = "field.id")
    @Mapping(source = "pictureId", target = "picture.id")
    PictureField pictureFieldDtoToPictureField(PictureFieldDto pictureFieldDto);

    @InheritInverseConfiguration(name = "pictureFieldDtoToPictureField")
    PictureFieldDto pictureFieldToPictureFieldDto(PictureField pictureField);

    @InheritConfiguration(name = "pictureFieldDtoToPictureField")
    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updatePictureFieldFromPictureFieldDto(PictureFieldDto pictureFieldDto, @MappingTarget PictureField pictureField);
}
