package com.example.enocaproject.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Employee {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;

    private  String name;

    private  String  email;

    private  Integer age;


    @ManyToMany
    @JoinTable(
            name = "employees_companies",
            joinColumns = @JoinColumn(
                    name = "employee_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "company_id", referencedColumnName = "id"))
    private List<Company> companies;



}
