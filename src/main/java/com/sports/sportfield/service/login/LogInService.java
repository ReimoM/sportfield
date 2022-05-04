package com.sports.sportfield.service.login;

import com.sports.sportfield.domain.role.Role;
import com.sports.sportfield.domain.role.RoleService;
import com.sports.sportfield.domain.user.User;
import com.sports.sportfield.domain.user.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Optional;

@Service
public class LogInService {

    @Resource
    private UserService userService;
    @Resource
    private RoleService roleService;


    public LogInResponse getValidUser(LogInRequest request) {
        User user = userService.getValidUser(request);


        LogInResponse response = new LogInResponse();
        response.setUserId(user.getId());
        response.setRoleId(user.getRole());

        return response;
    }
}
