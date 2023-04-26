package com.example.mycompany.app.service;

import com.example.mycompany.app.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mycompany.app.repository.CompanyRepository;

import java.util.List;
@Service
public class CompanyService {
    private final CompanyRepository companyRepository;
    @Autowired

    public CompanyService(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    public Company findById(Long id){
        return companyRepository.getOne(id);
    }
    public List<Company> findAll(){
        return companyRepository.findAll();
    }
    public Company saveCompany(Company company){
        return companyRepository.save(company);
    }
    public void deleteById(Long id){
        companyRepository.deleteById(id);
    }
}
