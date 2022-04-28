package com.sports.sportfield.domain.contact;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/contact")
public class ContactController {


    @Resource
    private ContactService contactService;

    @PostMapping
    @Operation(summary = "Lisab uue kontakti")
    public ContactDto addNewContact(@RequestBody ContactDto contactDto) {
        return contactService.addNewContact(contactDto);
    }


    @GetMapping("/all")
    @Operation(summary = "Kuvab kõik kontaktid")
    public List<ContactDto> findAllContacts() {
        return contactService.findAllContacts();
    }

    @GetMapping("/id")
    @Operation(summary = "Kuvab kontaktid id järgi")
    public ContactDto findContactById(@RequestParam Integer id) {
        return contactService.findContactById(id);
    }

    @DeleteMapping("/id")
    @Operation(summary = "Kustutab kasutaja id järgi")
    public void deleteContactById(@RequestParam Integer id) {
        contactService.deleteContactById(id);
    }

    @PutMapping("/id")
    @Operation(summary = "Uuendab kasutaja id järgi")
    public void updateContactById(@RequestParam Integer id, @RequestBody ContactDto contactDto) {
        contactService.updateContactById(id, contactDto);
    }








}
