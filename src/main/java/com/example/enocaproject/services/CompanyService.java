package com.example.enocaproject.services;


import com.example.enocaproject.entities.Company;
import com.example.enocaproject.repositories.CompanyRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class CompanyService {

    final CompanyRepository companyRepository;

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }



    public ResponseEntity add (Company company){
        Map<String,Object> hm=new LinkedHashMap<>();
        companyRepository.save(company);
        hm.put("status",true);
        return new ResponseEntity(hm, HttpStatus.OK);
    }






}
