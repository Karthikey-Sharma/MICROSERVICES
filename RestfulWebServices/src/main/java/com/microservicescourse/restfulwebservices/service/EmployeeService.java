package com.microservicescourse.restfulwebservices.service;

import com.microservicescourse.restfulwebservices.model.Employee;

import java.util.List;

public interface EmployeeService {
    Employee save(Employee employee);

    List<Employee> getAllEmployees();

    Employee getEmployeeById(String id);

    String deleteEmployeeById(String id);
}
