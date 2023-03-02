package com.example.enocaproject.services;

import com.example.enocaproject.entities.Company;
import com.example.enocaproject.entities.Employee;
import com.example.enocaproject.repositories.EmployeeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class EmployeeService {

    final EmployeeRepository employeeRepository;

    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public ResponseEntity add (Employee employee){
        Map<String,Object> hm=new LinkedHashMap<>();
        employeeRepository.save(employee);
        hm.put("status",true);
        hm.put("result",employee);
        return new ResponseEntity(hm, HttpStatus.OK);
    }


    public ResponseEntity list( ){
        Map<String,Object> hm =new LinkedHashMap<>();
        hm.put("status",true);
        hm.put("result",employeeRepository.findAll());
        return  new ResponseEntity(hm,HttpStatus.OK);
    }
}






















































