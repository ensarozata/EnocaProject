package com.example.enocaproject.controllers;

import com.example.enocaproject.entities.Company;
import com.example.enocaproject.entities.Employee;
import com.example.enocaproject.services.EmployeeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody Employee employee){
        return employeeService.add(employee);
    }

    @GetMapping("/list")
    public ResponseEntity list(){
        return employeeService.list();
    }
}
