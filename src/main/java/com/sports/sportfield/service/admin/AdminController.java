package com.sports.sportfield.service.admin;

import com.sports.sportfield.domain.user.UserDto;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Resource
    private AdminService adminService;

    @PostMapping("/add")
    @Operation(summary = "Lisab uue kasutaja")
    public UserDto addNewUser(@RequestBody UserDto userDto) {
        return adminService.addNewUser(userDto);
    }

    @DeleteMapping("/id")
    @Operation(summary = "kustutab kasutaja koos kontaktiga id järgi")
    public void deleteUserById(@RequestParam Integer id) {
        adminService.deleteUserById(id);
    }

    @GetMapping("/id")
    @Operation(summary = "leiab kasutaja id järgi")
    public UserDto findUserById(@RequestParam Integer id) {
        return adminService.findUserById(id);
    }

    @GetMapping("/all")
    @Operation(summary = "kuvab kõik kasutajad ja paroolid")
    public List<UserDto> findAllUsers() {
        return adminService.findAllUsers();
    }






}
