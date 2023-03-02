package com.example.enocaproject.repositories;

import com.example.enocaproject.entities.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Integer> {
}