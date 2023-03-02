package com.example.enocaproject.controllers;

import com.example.enocaproject.entities.Company;
import com.example.enocaproject.services.CompanyService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/company")
public class CompanyController {

    final CompanyService companyService;


    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody Company company){
        return companyService.add(company);
    }
}
