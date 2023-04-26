package com.example.mycompany.app.repository;

import com.example.mycompany.app.model.Company;
import com.example.mycompany.app.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<Employees, Long>{
}
