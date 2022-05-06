package com.sports.sportfield.service.admin;

import com.sports.sportfield.domain.user.UserDto;
import com.sports.sportfield.domain.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdminService {

    @Resource
    private UserService userService;

    public UserDto addNewUser(UserDto userDto) {
        return userService.addNewUser(userDto);
    }

    public void deleteUserById(Integer id) {
        userService.deleteUserById(id);
    }

    public UserDto findUserById(Integer id) {
        return userService.findUserById(id);
    }

    public List<UserDto> findAllUsers() {
        return userService.findAllUsers();
    }
}
