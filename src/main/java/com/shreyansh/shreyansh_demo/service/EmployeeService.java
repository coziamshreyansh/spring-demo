package com.shreyansh.shreyansh_demo.service;

import com.shreyansh.shreyansh_demo.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);
    List<Employee> retrieveDetails();

    Employee retrieveDetailsByEmployeeId(String employeeId);
}
