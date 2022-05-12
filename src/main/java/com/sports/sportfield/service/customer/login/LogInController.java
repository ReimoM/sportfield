package com.sports.sportfield.service.customer.login;


import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("/login")
public class LogInController {

    @Resource
    private LogInService loginService;

    @PostMapping
    public LogInResponse getValidUser(@RequestBody LogInRequest request) {
        return loginService.getValidUser(request);
    }
}
