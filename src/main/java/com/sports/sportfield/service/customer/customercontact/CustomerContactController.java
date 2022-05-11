package com.sports.sportfield.service.customer.customercontact;

import com.sports.sportfield.domain.contact.ContactDto;
import com.sports.sportfield.domain.user.UserDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping
public class CustomerContactController {

    @Resource
    private CustomerContactService customerContactService;

    @PostMapping
    @Operation(summary = "Lisab uue kontakti")
    public ContactDto addNewContact(@RequestBody ContactDto contactDto) {
        return customerContactService.addNewContact(contactDto);
    }

    @GetMapping("/all")
    @Operation(summary = "Kuvab kõik kontaktid")
    public List<ContactDto> findAllContacts() {
        return customerContactService.findAllContacts();
    }

    @GetMapping("/id")
    @Operation(summary = "Kuvab kontaktid id järgi")
    public ContactDto findContactById(@RequestParam Integer id) {
        return customerContactService.findContactById(id);
    }

    @DeleteMapping("/id")
    @Operation(summary = "Kustutab kasutaja id järgi")
    public void deleteContactById(@RequestParam Integer id) {
        customerContactService.deleteContactById(id);
    }

    @PutMapping("/id")
    @Operation(summary = "Uuendab kasutaja id järgi")
    public void updateContactById(@RequestParam Integer id, @RequestBody ContactDto contactDto) {
        customerContactService.updateContactById(id, contactDto);
    }

}
