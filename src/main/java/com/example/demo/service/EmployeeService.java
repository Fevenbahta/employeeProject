package com.example.demo.service;

import com.example.demo.Entity.EmployeeEntity;
import com.example.demo.dto.EmployeeDto;
import com.example.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;
    public EmployeeDto getemployee(Integer id) {
        EmployeeEntity employee =employeeRepository.getemployee(id);
        EmployeeDto employeeDto = new EmployeeDto();
        return employeeDto.EmployeeMapper(employee);
    }
}
