package com.example.mycompany.app.repository;

import com.example.mycompany.app.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long>{
}
