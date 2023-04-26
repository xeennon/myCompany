package com.example.mycompany.app.controller;


import com.example.mycompany.app.model.Company;
import com.example.mycompany.app.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@ComponentScan("com.ittutoria.controller")

public class CompanyController {
    private final CompanyService companyService;

@Autowired

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping("/company")
    public String findAll(Model model){
        List<Company> company = companyService.findAll();
        model.addAttribute("company", company);
        return "company-list";
    }
    @GetMapping("/company-create")
    public String createCompanyForm(Company company){
        return "company-create";

    }
    @PostMapping
    public String createCompany(Company company){
        companyService.saveCompany(company);
        return "redirect:/company";
    }
    @PostMapping("/company-create")
    public String createCompanySubmit(Company company){
        companyService.saveCompany(company);
        return "redirect:/company";
    }

    @GetMapping("company-delete/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        companyService.deleteById(id);
        return "redirect:/company";
    }

    @GetMapping("/company-update/{id}")
    public String updateCompanyForm(@PathVariable("id") Long id, Model model){
        Company company = companyService.findById(id);
        model.addAttribute("company", company);
        return "company-update";
    }


    @PostMapping("/company-update")
    public String updateCompany(Company company){
        companyService.saveCompany(company);
        return "redirect:/company";
    }
}
