package com.keikantswe.department.service.model;

import java.util.ArrayList;
import java.util.List;

public class DepartmentModel {

    private Long Id;
    private String name;
    private List<Employee> employees = new ArrayList<>();

    public DepartmentModel() {
    }

    public DepartmentModel(Long id, String name) {
        Id = id;
        this.name = name;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "DepartmentModel{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }
}
