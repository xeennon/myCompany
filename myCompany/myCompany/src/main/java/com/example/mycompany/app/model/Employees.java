package com.example.mycompany.app.model;

import jakarta.persistence.*;

@Entity
@Table(name= "employees")

public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employee_id;

    @Column (name= "company_id")
    private int company_id;
    @Column(name = "name")
    private String name;
    @Column(name = "position")
    private String position;
    @Column(name = "work_experience")
    private String work_experience;

    // Геттер для employee_id
    public Long getEmployee_id() {
        return employee_id;
    }

    // Сеттер для employee_id
    public void setEmployee_id(Long employee_id) {
        this.employee_id = employee_id;
    }

    // Геттер для company_id
    public int getCompany_id() {
        return company_id;
    }

    // Сеттер для company_id
    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    // Геттер для name
    public String getName() {
        return name;
    }

    // Сеттер для name
    public void setName(String name) {
        this.name = name;
    }

    // Геттер для position
    public String getPosition() {
        return position;
    }

    // Сеттер для position
    public void setPosition(String position) {
        this.position = position;
    }

    // Геттер для work_experience
    public String getWork_experience() {
        return work_experience;
    }

    // Сеттер для work_experience
    public void setWork_experience(String work_experience) {
        this.work_experience = work_experience;
    }
}
