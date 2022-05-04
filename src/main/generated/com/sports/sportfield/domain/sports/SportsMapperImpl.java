package com.sports.sportfield.domain.sports;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-04T15:13:41+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Amazon.com Inc.)"
)
@Component
public class SportsMapperImpl implements SportsMapper {

    @Override
    public Sports toEntity(SportsDto sportsDto) {
        if ( sportsDto == null ) {
            return null;
        }

        Sports sports = new Sports();

        sports.setSportsType( sportsDto.getSportsType() );

        return sports;
    }

    @Override
    public SportsDto toDto(Sports sports) {
        if ( sports == null ) {
            return null;
        }

        SportsDto sportsDto = new SportsDto();

        sportsDto.setId( sports.getId() );
        sportsDto.setSportsType( sports.getSportsType() );

        return sportsDto;
    }

    @Override
    public List<SportsDto> toDtos(List<Sports> sports) {
        if ( sports == null ) {
            return null;
        }

        List<SportsDto> list = new ArrayList<SportsDto>( sports.size() );
        for ( Sports sports1 : sports ) {
            list.add( toDto( sports1 ) );
        }

        return list;
    }

    @Override
    public void updateEntity(SportsDto sportsDto, Sports sports) {
        if ( sportsDto == null ) {
            return;
        }

        if ( sportsDto.getSportsType() != null ) {
            sports.setSportsType( sportsDto.getSportsType() );
        }
    }
}
