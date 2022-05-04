package com.sports.sportfield.domain.role;

import com.sports.sportfield.service.login.LogInRequest;
import com.sports.sportfield.service.login.LogInResponse;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoleService {

    @Resource
    private RoleRepository roleRepository;

//    public Role getUserRoleById(Integer id) {
//    return roleRepository.findByUserId(id);
//
//    }
}
