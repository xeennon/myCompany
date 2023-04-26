package com.example.mycompany.app.service;

import com.example.mycompany.app.model.Company;
import com.example.mycompany.app.model.Employees;
import com.example.mycompany.app.repository.CompanyRepository;
import com.example.mycompany.app.repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeesService {
    private final EmployeesRepository employeesRepository;
    @Autowired

    public EmployeesService(EmployeesRepository employeesRepository) {
        this.employeesRepository = employeesRepository;
    }

    public Employees findById(Long id){
        return employeesRepository.getOne(id);
    }
    public List<Employees> findAll(){
        return employeesRepository.findAll();
    }
    public Employees saveEmployees(Employees employees){
        return employeesRepository.save(employees);
    }
    public void deleteById(Long id){
        employeesRepository.deleteById(id);
    }
}
