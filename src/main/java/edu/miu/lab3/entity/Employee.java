package edu.miu.lab3.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employeeId;
    private String fullName;
    private int salary;

    @OneToOne(cascade = CascadeType.ALL)
    private EmployeeProfile employeeProfile;

    @OneToMany(mappedBy = "employee")
    private List<Dependent> dependents;

}
