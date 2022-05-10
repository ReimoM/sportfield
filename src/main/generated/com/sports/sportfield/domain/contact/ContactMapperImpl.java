package com.sports.sportfield.domain.contact;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-10T12:07:25+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Amazon.com Inc.)"
)
@Component
public class ContactMapperImpl implements ContactMapper {

    @Override
    public Contact toEntity(ContactDto contactDto) {
        if ( contactDto == null ) {
            return null;
        }

        Contact contact = new Contact();

        contact.setFirstName( contactDto.getFirstName() );
        contact.setLastName( contactDto.getLastName() );
        contact.setTelephone( contactDto.getTelephone() );
        contact.setEmail( contactDto.getEmail() );

        return contact;
    }

    @Override
    public ContactDto toDto(Contact contact) {
        if ( contact == null ) {
            return null;
        }

        ContactDto contactDto = new ContactDto();

        contactDto.setId( contact.getId() );
        contactDto.setFirstName( contact.getFirstName() );
        contactDto.setLastName( contact.getLastName() );
        contactDto.setTelephone( contact.getTelephone() );
        contactDto.setEmail( contact.getEmail() );

        return contactDto;
    }

    @Override
    public List<ContactDto> toDtos(List<Contact> contact) {
        if ( contact == null ) {
            return null;
        }

        List<ContactDto> list = new ArrayList<ContactDto>( contact.size() );
        for ( Contact contact1 : contact ) {
            list.add( toDto( contact1 ) );
        }

        return list;
    }

    @Override
    public void updateEntity(ContactDto contactDto, Contact contact) {
        if ( contactDto == null ) {
            return;
        }

        if ( contactDto.getFirstName() != null ) {
            contact.setFirstName( contactDto.getFirstName() );
        }
        if ( contactDto.getLastName() != null ) {
            contact.setLastName( contactDto.getLastName() );
        }
        if ( contactDto.getTelephone() != null ) {
            contact.setTelephone( contactDto.getTelephone() );
        }
        if ( contactDto.getEmail() != null ) {
            contact.setEmail( contactDto.getEmail() );
        }
    }
}
