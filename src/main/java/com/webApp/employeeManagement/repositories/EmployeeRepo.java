package com.webApp.employeeManagement.repositories;

import com.webApp.employeeManagement.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
}
