package edu.miu.lab3.service;

import edu.miu.lab3.entity.Employee;
import edu.miu.lab3.repo.EmployeeRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EmployeeService {

    private EmployeeRepo employeeRepo;

    public List<Employee> find(int salary, String keyword) {
        return employeeRepo.findAllBySalaryGreaterThanAndFullnameContains(salary, keyword);
    }
}
