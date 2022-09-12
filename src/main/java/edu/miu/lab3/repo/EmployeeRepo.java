package edu.miu.lab3.repo;

import edu.miu.lab3.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer> {
    List<Employee> findAllBySalaryGreaterThanAndFullnameContains(int salary, String keyword);
}
