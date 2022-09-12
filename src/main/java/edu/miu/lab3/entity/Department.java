package edu.miu.lab3.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentId;
    private String departmentName;

    @JoinTable(name = "works_on")
    @OneToMany
    private List<Project> projects;

}
