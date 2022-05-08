package com.sports.sportfield.domain.user;

import com.sports.sportfield.domain.contact.Contact;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-05-08T12:08:57+0300",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 16.0.2 (Amazon.com Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        User user = new User();

        user.setContact( userDtoToContact( userDto ) );
        user.setUsername( userDto.getUsername() );
        user.setPassword( userDto.getPassword() );

        return user;
    }

    @Override
    public UserDto toDto(User user) {
        if ( user == null ) {
            return null;
        }

        UserDto userDto = new UserDto();

        userDto.setUserId( user.getId() );
        userDto.setContactFirstName( userContactFirstName( user ) );
        userDto.setContactLastName( userContactLastName( user ) );
        userDto.setContactTelephone( userContactTelephone( user ) );
        userDto.setContactEmail( userContactEmail( user ) );
        userDto.setUsername( user.getUsername() );
        userDto.setPassword( user.getPassword() );

        return userDto;
    }

    @Override
    public List<UserDto> toDtos(List<User> users) {
        if ( users == null ) {
            return null;
        }

        List<UserDto> list = new ArrayList<UserDto>( users.size() );
        for ( User user : users ) {
            list.add( toDto( user ) );
        }

        return list;
    }

    @Override
    public void updateDto(UserDto userDto, User user) {
        if ( userDto == null ) {
            return;
        }

        if ( user.getContact() == null ) {
            user.setContact( new Contact() );
        }
        userDtoToContact1( userDto, user.getContact() );
        if ( userDto.getUsername() != null ) {
            user.setUsername( userDto.getUsername() );
        }
        if ( userDto.getPassword() != null ) {
            user.setPassword( userDto.getPassword() );
        }
    }

    protected Contact userDtoToContact(UserDto userDto) {
        if ( userDto == null ) {
            return null;
        }

        Contact contact = new Contact();

        contact.setFirstName( userDto.getContactFirstName() );
        contact.setLastName( userDto.getContactLastName() );
        contact.setTelephone( userDto.getContactTelephone() );
        contact.setEmail( userDto.getContactEmail() );

        return contact;
    }

    private String userContactFirstName(User user) {
        if ( user == null ) {
            return null;
        }
        Contact contact = user.getContact();
        if ( contact == null ) {
            return null;
        }
        String firstName = contact.getFirstName();
        if ( firstName == null ) {
            return null;
        }
        return firstName;
    }

    private String userContactLastName(User user) {
        if ( user == null ) {
            return null;
        }
        Contact contact = user.getContact();
        if ( contact == null ) {
            return null;
        }
        String lastName = contact.getLastName();
        if ( lastName == null ) {
            return null;
        }
        return lastName;
    }

    private String userContactTelephone(User user) {
        if ( user == null ) {
            return null;
        }
        Contact contact = user.getContact();
        if ( contact == null ) {
            return null;
        }
        String telephone = contact.getTelephone();
        if ( telephone == null ) {
            return null;
        }
        return telephone;
    }

    private String userContactEmail(User user) {
        if ( user == null ) {
            return null;
        }
        Contact contact = user.getContact();
        if ( contact == null ) {
            return null;
        }
        String email = contact.getEmail();
        if ( email == null ) {
            return null;
        }
        return email;
    }

    protected void userDtoToContact1(UserDto userDto, Contact mappingTarget) {
        if ( userDto == null ) {
            return;
        }

        if ( userDto.getContactFirstName() != null ) {
            mappingTarget.setFirstName( userDto.getContactFirstName() );
        }
        if ( userDto.getContactLastName() != null ) {
            mappingTarget.setLastName( userDto.getContactLastName() );
        }
        if ( userDto.getContactTelephone() != null ) {
            mappingTarget.setTelephone( userDto.getContactTelephone() );
        }
        if ( userDto.getContactEmail() != null ) {
            mappingTarget.setEmail( userDto.getContactEmail() );
        }
    }
}
