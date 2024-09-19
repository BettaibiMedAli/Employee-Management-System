package com.webApp.employeeManagement.services;

import com.webApp.employeeManagement.dto.UserRegistrationDto;
import com.webApp.employeeManagement.models.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User save (UserRegistrationDto registrationDto);
}
