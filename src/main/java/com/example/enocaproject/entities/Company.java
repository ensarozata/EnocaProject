package com.example.enocaproject.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String companyName;

    @ManyToMany(mappedBy = "companies")
    private List<Employee> employees;









}
