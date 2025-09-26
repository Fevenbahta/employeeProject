package com.example.demo.repository;

import com.example.demo.Entity.EmployeeEntity;
import com.example.demo.dto.EmployeeDto;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeRepository {

    public EmployeeEntity getemployee(Integer id) {

        return new EmployeeEntity(1,"feven","IT","40");
    }
}
