package edu.miu.lab3.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int projectId;
    private String name;
    private String location;

    @ManyToOne
    private Department department;

}
