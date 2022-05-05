package com.sports.sportfield.domain.role;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoleService {

    @Resource
    private RoleRepository roleRepository;

    public Role getRoleUser() {
        return roleRepository.getById(1);
    }
}
