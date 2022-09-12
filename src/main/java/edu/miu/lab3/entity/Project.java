package edu.miu.lab3.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "project_id")
    private int id;
    private String name;
    private String location;

    @JoinColumn(name = "department_id")
    @ManyToOne
    private Department department;

    @ManyToMany(mappedBy = "projects")
    private List<Employee> employee;

}
