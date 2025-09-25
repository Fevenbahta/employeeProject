package com.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    public String getemployee(Integer id) {
        return "employee";
    }
}
