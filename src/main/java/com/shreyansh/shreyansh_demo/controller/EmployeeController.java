package com.shreyansh.shreyansh_demo.controller;

import com.shreyansh.shreyansh_demo.model.Employee;
import com.shreyansh.shreyansh_demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

//    injecting EmployeeServiceImpl ka object here
    @Autowired
    private EmployeeService employeeService;

    @PostMapping
    public Employee save(@RequestBody Employee employee){
        return employeeService.save(employee);
    }
    @GetMapping
    public List<Employee> fetchDetails(){
        return employeeService.retrieveDetails();
    }

    @GetMapping("/{id}")
    public Employee fetchDetailsByEmployeeId(@PathVariable(name = "id") String employeeId){
        return employeeService.retrieveDetailsByEmployeeId(employeeId);
    }

}
