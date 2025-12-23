package com.microservicescourse.restfulwebservices.service;

import com.microservicescourse.restfulwebservices.error.EmployeeNotFoundException;
import com.microservicescourse.restfulwebservices.model.Employee;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service // this is the service layer , all the business logic will be here
public class EmployeeServiceImpl implements EmployeeService{


    List<Employee> employees = new ArrayList<>();



    @Override
    public Employee save(Employee employee) {
        if(employee.getEmployeeId() == null || employee.getEmailId().isEmpty()){
            employee.setEmployeeId(UUID.randomUUID().toString());
        }
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees(){
        return employees;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return employees
                .stream()
                .filter(employee -> employee.getEmployeeId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() -> new EmployeeNotFoundException("" + "Employee not found with ID :" + id));
    }




}
