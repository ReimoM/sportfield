package com.sports.sportfield.domain.sportsfield;

import com.sports.sportfield.domain.field.field.Field;
import com.sports.sportfield.domain.sports.Sports;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-10T15:54:00+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Amazon.com Inc.)"
)
@Component
public class SportsFieldMapperImpl implements SportsFieldMapper {

    @Override
    public SportsField toEntity(SportsFieldDto sportsFieldDto) {
        if ( sportsFieldDto == null ) {
            return null;
        }

        SportsField sportsField = new SportsField();

        sportsField.setField( sportsFieldDtoToField( sportsFieldDto ) );
        sportsField.setSports( sportsFieldDtoToSports( sportsFieldDto ) );
        sportsField.setId( sportsFieldDto.getId() );

        return sportsField;
    }

    @Override
    public SportsFieldDto toDto(SportsField sportsField) {
        if ( sportsField == null ) {
            return null;
        }

        String fieldName = null;
        Boolean fieldIsActive = null;
        String sportsSportsType = null;
        Integer id = null;

        fieldName = sportsFieldFieldName( sportsField );
        fieldIsActive = sportsFieldFieldIsActive( sportsField );
        sportsSportsType = sportsFieldSportsSportsType( sportsField );
        id = sportsField.getId();

        Integer fieldId = null;
        Integer sportsId = null;

        SportsFieldDto sportsFieldDto = new SportsFieldDto( id, fieldId, fieldName, fieldIsActive, sportsId, sportsSportsType );

        return sportsFieldDto;
    }

    @Override
    public List<SportsFieldDto> toDtos(List<SportsField> sportsFields) {
        if ( sportsFields == null ) {
            return null;
        }

        List<SportsFieldDto> list = new ArrayList<SportsFieldDto>( sportsFields.size() );
        for ( SportsField sportsField : sportsFields ) {
            list.add( toDto( sportsField ) );
        }

        return list;
    }

    @Override
    public void updateEntity(SportsFieldDto sportsFieldDto, SportsField sportsField) {
        if ( sportsFieldDto == null ) {
            return;
        }

        if ( sportsField.getField() == null ) {
            sportsField.setField( new Field() );
        }
        sportsFieldDtoToField1( sportsFieldDto, sportsField.getField() );
        if ( sportsField.getSports() == null ) {
            sportsField.setSports( new Sports() );
        }
        sportsFieldDtoToSports1( sportsFieldDto, sportsField.getSports() );
        if ( sportsFieldDto.getId() != null ) {
            sportsField.setId( sportsFieldDto.getId() );
        }
    }

    protected Field sportsFieldDtoToField(SportsFieldDto sportsFieldDto) {
        if ( sportsFieldDto == null ) {
            return null;
        }

        Field field = new Field();

        field.setName( sportsFieldDto.getFieldName() );
        field.setIsActive( sportsFieldDto.getFieldIsActive() );

        return field;
    }

    protected Sports sportsFieldDtoToSports(SportsFieldDto sportsFieldDto) {
        if ( sportsFieldDto == null ) {
            return null;
        }

        Sports sports = new Sports();

        sports.setSportsType( sportsFieldDto.getSportsSportsType() );

        return sports;
    }

    private String sportsFieldFieldName(SportsField sportsField) {
        if ( sportsField == null ) {
            return null;
        }
        Field field = sportsField.getField();
        if ( field == null ) {
            return null;
        }
        String name = field.getName();
        if ( name == null ) {
            return null;
        }
        return name;
    }

    private Boolean sportsFieldFieldIsActive(SportsField sportsField) {
        if ( sportsField == null ) {
            return null;
        }
        Field field = sportsField.getField();
        if ( field == null ) {
            return null;
        }
        Boolean isActive = field.getIsActive();
        if ( isActive == null ) {
            return null;
        }
        return isActive;
    }

    private String sportsFieldSportsSportsType(SportsField sportsField) {
        if ( sportsField == null ) {
            return null;
        }
        Sports sports = sportsField.getSports();
        if ( sports == null ) {
            return null;
        }
        String sportsType = sports.getSportsType();
        if ( sportsType == null ) {
            return null;
        }
        return sportsType;
    }

    protected void sportsFieldDtoToField1(SportsFieldDto sportsFieldDto, Field mappingTarget) {
        if ( sportsFieldDto == null ) {
            return;
        }

        if ( sportsFieldDto.getFieldName() != null ) {
            mappingTarget.setName( sportsFieldDto.getFieldName() );
        }
        if ( sportsFieldDto.getFieldIsActive() != null ) {
            mappingTarget.setIsActive( sportsFieldDto.getFieldIsActive() );
        }
    }

    protected void sportsFieldDtoToSports1(SportsFieldDto sportsFieldDto, Sports mappingTarget) {
        if ( sportsFieldDto == null ) {
            return;
        }

        if ( sportsFieldDto.getSportsSportsType() != null ) {
            mappingTarget.setSportsType( sportsFieldDto.getSportsSportsType() );
        }
    }
}
