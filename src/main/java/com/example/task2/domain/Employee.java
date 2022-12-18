package com.example.task2.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Employee {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String hiringDate;
    private String hiringSource;
    private String department;
    private String country;

    protected Employee(){

    }

    public Employee(String name, String hiringDate, String hiringSource, String department, String country) {
        this.name = name;
        this.hiringDate = hiringDate;
        this.hiringSource = hiringSource;
        this.department = department;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(String hiringDate) {
        this.hiringDate = hiringDate;
    }

    public String getHiringSource() {
        return hiringSource;
    }

    public void setHiringSource(String hiringSource) {
        this.hiringSource = hiringSource;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hiringDate='" + hiringDate + '\'' +
                ", hiringSource='" + hiringSource + '\'' +
                ", department='" + department + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
