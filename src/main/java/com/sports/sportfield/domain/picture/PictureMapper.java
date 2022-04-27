package com.sports.sportfield.domain.picture;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface PictureMapper {
    Picture toEntity(PictureDto pictureDto);

    PictureDto toDto(Picture picture);

    List<PictureDto> toDtos(List<Picture> picture);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntity(PictureDto pictureDto, @MappingTarget Picture picture);
}
