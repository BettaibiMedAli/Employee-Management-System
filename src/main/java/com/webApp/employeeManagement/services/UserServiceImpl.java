package com.webApp.employeeManagement.services;

import com.webApp.employeeManagement.dto.UserRegistrationDto;
import com.webApp.employeeManagement.models.User;
import com.webApp.employeeManagement.repositories.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepo userRepo;

    @Override
    public User save(UserRegistrationDto registrationDto) {
        return null;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
