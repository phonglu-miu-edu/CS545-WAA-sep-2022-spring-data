package edu.miu.lab3.controller;

import edu.miu.lab3.entity.Department;
import edu.miu.lab3.entity.Employee;
import edu.miu.lab3.service.EmployeeService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    @GetMapping()
    public List<Employee> findAll() {
        List<Employee> employees = employeeService.find(40, "Computer");
        return employees;
    }

}
