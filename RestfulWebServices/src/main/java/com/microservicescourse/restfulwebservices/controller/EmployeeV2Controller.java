package com.microservicescourse.restfulwebservices.controller;

import com.microservicescourse.restfulwebservices.model.Employee;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/v2/employees")
public class EmployeeV2Controller {
    @PostMapping
    public Employee save(@RequestBody Employee employee){
        return employee;
    }
}
