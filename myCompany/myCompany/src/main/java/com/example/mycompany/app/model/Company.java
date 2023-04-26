package com.example.mycompany.app.model;

import jakarta.persistence.*;

@Entity
@Table(name= "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long company_id;
    @Column(name = "name")
    private String name;
    @Column(name = "location")
    private String location;
    @Column(name = "specialization")
    private String specialization;
    @Column(name = "income_per_year")
    private String income_per_year;
    // Getter for company_id
    public Long getCompany_id() {
        return company_id;
    }

    // Setter for company_id
    public void setCompany_id(Long company_id) {
        this.company_id = company_id;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for location
    public String getLocation() {
        return location;
    }

    // Setter for location
    public void setLocation(String location) {
        this.location = location;
    }

    // Getter for specialization
    public String getSpecialization() {
        return specialization;
    }

    // Setter for specialization
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    // Getter for income_per_year
    public String getIncome_per_year() {
        return income_per_year;
    }

    // Setter for income_per_year
    public void setIncome_per_year(String income_per_year) {
        this.income_per_year = income_per_year;
    }
}
