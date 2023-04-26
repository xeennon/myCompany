package com.example.mycompany.app.controller;



import com.example.mycompany.app.model.Company;
import com.example.mycompany.app.model.Employees;
import com.example.mycompany.app.service.CompanyService;
import com.example.mycompany.app.service.EmployeesService;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;


@Controller
@ComponentScan("com.ittutoria.controller")
public class EmployeesController {
    private final EmployeesService employeesService;


    public EmployeesController(EmployeesService employeesService) {
        this.employeesService = employeesService;
    }

    @GetMapping("/employees")
    public String findAll(Model model){
        List<Employees> employees = employeesService.findAll();
        model.addAttribute("employees", employees);
        return "employees-list";
    }
    @GetMapping("/employees-create")
    public String createEmployeesForm(Employees employees){
        return "employees-create";

    }
    @PostMapping("/employees") // Change the URL mapping to make it unique
    public String createEmployees(Employees employees){
        employeesService.saveEmployees(employees);
        return "redirect:/employees";
    }
    @PostMapping("/employees-create")
    public String createEmployeesSubmit(Employees employees){
        employeesService.saveEmployees(employees);
        return "redirect:/employees";
    }

    @GetMapping("employees-delete/{id}")
    public String deleteUser(@PathVariable("id") Long id){
        employeesService.deleteById(id);
        return "redirect:/employees";
    }

    @GetMapping("/employees-update/{id}")
    public String updateEmployeesForm(@PathVariable("id") Long id, Model model){
        Employees employees = employeesService.findById(id);
        model.addAttribute("employee", employees);
        return "employees-update";
    }

    @PostMapping("/employees-update")
    public String updateEmployees(Employees employees){
        employeesService.saveEmployees(employees);
        return "redirect:/employees";
    }
}
