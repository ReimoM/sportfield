package com.sports.sportfield.domain.user;


import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/add")
    @Operation(summary = "Lisab uue kasutaja")
    public UserDto addNewUser(@RequestBody UserDto userDto) {
        return userService.addNewUser(userDto);
    }

    @GetMapping("/all")
    @Operation(summary = "kuvab kõik kasutajad ja paroolid")
    public List<UserDto> findAllUsers() {
        return userService.findAllUsers();
    }

    @GetMapping("/id")
    @Operation(summary = "leiab kasutaja id järgi")
    public UserDto findUserById(@RequestParam Integer id) {
        return userService.findUserById(id);
    }

    @DeleteMapping("/id")
    @Operation(summary = "kustutab kasutaja koos kontaktiga id järgi")
    public void deleteUserById(@RequestParam Integer id) {
        userService.deleteUserById(id);
    }


}
