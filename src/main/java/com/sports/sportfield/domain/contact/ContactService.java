package com.sports.sportfield.domain.contact;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ContactService {

    @Resource
    private ContactMapper contactMapper;

    @Resource
    private ContactRepository contactRepository;

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

    public void deleteContactById(Integer id) {contactRepository.deleteById(id);
    }

    public void updateContactById(Integer id, ContactDto contactDto) {
        Contact contact = contactRepository.getById(id);
        contactMapper.updateEntity(contactDto, contact);
        contactRepository.save(contact);
    }
}
