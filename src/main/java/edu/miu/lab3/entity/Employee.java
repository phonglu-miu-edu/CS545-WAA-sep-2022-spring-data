package edu.miu.lab3.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_id")
    private int id;
    private String fullname;
    private int salary;

    @OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
    private EmployeeProfile employeeProfile;

    @OneToMany(mappedBy = "employee")
    private List<Dependent> dependents;

    @JoinTable(name = "works_on",
            joinColumns = @JoinColumn(name = "employee_id"),
            inverseJoinColumns = @JoinColumn(name = "project_id"))
    @ManyToMany
    private List<Project> projects;

}
