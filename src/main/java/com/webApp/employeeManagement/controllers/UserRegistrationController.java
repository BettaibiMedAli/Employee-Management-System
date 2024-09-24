package com.webApp.employeeManagement.controllers;

import com.webApp.employeeManagement.dto.UserRegistrationDto;
import com.webApp.employeeManagement.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/registration")
public class UserRegistrationController {
    @Autowired
    private UserService userService;

    @ModelAttribute
    public UserRegistrationDto userRegistrationDto()
    {
        return new UserRegistrationDto();
    }

    @GetMapping
    public String showRegistrationForm()
    {
        return "registration";
    }

    @PostMapping
    public String RegisterUserAccount(@ModelAttribute("user") UserRegistrationDto userRegistrationDto)
    {
        userService.save(userRegistrationDto);
        return "redirect:/registration?success";
    }
}
