package com.sports.sportfield.service.customer.customercontact;

import com.sports.sportfield.domain.contact.ContactDto;
import com.sports.sportfield.domain.contact.ContactService;
import com.sports.sportfield.domain.user.UserDto;
import com.sports.sportfield.domain.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CustomerContactService {

    @Resource
    private ContactService contactService;

    private UserService userService;

    public ContactDto addNewContact(ContactDto contactDto) {
        return contactService.addNewContact(contactDto);
    }

    public List<ContactDto> findAllContacts() {
        return contactService.findAllContacts();
    }

    public ContactDto findContactById(Integer id) {
        return contactService.findContactById(id);
    }

    public void deleteContactById(Integer id) {
        contactService.deleteContactById(id);
    }

    public void updateContactById(Integer userId, ContactDto contactDto) {
        contactService.updateContactById(userId, contactDto);
    }

}
