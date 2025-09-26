package com.example.demo.dto;

import com.example.demo.Entity.EmployeeEntity;

public class EmployeeDto {
    String name;
    String department;
    String age;

    public void setAge(String age) {
        this.age = age;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getAge() { return age; }


    public EmployeeDto EmployeeMapper(EmployeeEntity employee) {
        this.setAge(employee.getAge());
        this.setDepartment(employee.getDepartment());
        this.setName(employee.getName());
        return this;
    }
}
