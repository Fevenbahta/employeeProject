package com.example.demo.controller;

import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

  @GetMapping("/getEmployee/{id}")
    public ResponseEntity<String> getmethod(Integer id)
    {
       String Employee= employeeService.getemployee(id);
       return ResponseEntity.ok(Employee);
    }
}
