package com.webApp.employeeManagement.repositories;

import com.webApp.employeeManagement.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmail(String username);
}
