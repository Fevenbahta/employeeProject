package com.example.demo.service;

import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public String getemployee(Integer id) {
      String employee =employeeRepository.getemployee(id);
        return employee;
    }
}
