package com.shreyansh.shreyansh_demo.service;

import com.shreyansh.shreyansh_demo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

// @Service means defining it as a service layer
@Service
public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> employeesDetail = new ArrayList<>();
    @Override
    public Employee save(Employee employee) {
        if(employee.getEmployeeId() == null || employee.getEmployeeId().isEmpty()){
            employee.setEmployeeId(UUID.randomUUID().toString());
        }
        employeesDetail.add(employee);
        return employee;
    }

    @Override
    public List<Employee> retrieveDetails() {
        return employeesDetail;
    }

    @Override
    public Employee retrieveDetailsByEmployeeId(String employeeId) {
        return employeesDetail.stream()
                .filter(employee -> employee.getEmployeeId().equals(employeeId))
                .findFirst()
                .get();
    }
}
