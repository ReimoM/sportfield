package com.sports.sportfield.domain.contact;

import com.sports.sportfield.domain.user.User;
import com.sports.sportfield.domain.user.UserMapper;
import com.sports.sportfield.domain.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContactService {

    @Resource
    private ContactMapper contactMapper;

    @Resource
    private ContactRepository contactRepository;

    @Resource
    private UserService userService;

    @Resource
    private UserMapper userMapper;

    public ContactDto addNewContact(ContactDto contactDto) {
        Contact contact = contactMapper.toEntity(contactDto);
        contactRepository.save(contact);
        return contactMapper.toDto(contact);
    }

    public List<ContactDto> findAllContacts() {
        List<Contact> contacts = contactRepository.findAll();
        return contactMapper.toDtos(contacts);
    }


    public ContactDto findContactById(Integer id) {
        Contact contact = contactRepository.getById(id);
        return contactMapper.toDto(contact);

    }

    public void deleteContactById(Integer id) {
        contactRepository.deleteById(id);
    }

    public void updateContactById(Integer userId, ContactDto contactDto) {
        User user = userMapper.toEntity(userService.findUserById(userId));
        Contact contact = user.getContact();
        contactMapper.updateEntity(contactDto, contact);
        contactRepository.save(contact);
    }
}
