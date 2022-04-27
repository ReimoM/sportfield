package com.sports.sportfield.domain.location;

import org.mapstruct.*;

import java.util.List;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface LocationMapper {

    @Mapping(target = "id", ignore = true)
    Location toEntity(LocationDto locationDto);

    LocationDto toDto(Location location);

    List<LocationDto> toDtos(List<Location> locations);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void updateEntity(LocationDto locationDto, @MappingTarget Location location);
}

