package com.springdemo.jwt.service;

import com.springdemo.jwt.entity.Role;
import com.springdemo.jwt.repository.RoleRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    @Transactional
    public Role createNewRole(Role role) {
        return roleRepository.save(role);
    }
}
