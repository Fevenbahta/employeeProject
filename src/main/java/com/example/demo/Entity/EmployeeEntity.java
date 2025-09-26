package com.example.demo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class EmployeeEntity {
    @Id
  Integer id;
   String name;
    String department;
    String age;

    public EmployeeEntity() {

    }

    public String getAge() {
        return age;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public EmployeeEntity(Integer id, String name, String department, String age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;

    }
}
