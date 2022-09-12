package edu.miu.lab3.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Dependent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dependent_id")
    private int id;
    private String fname;
    private String relationship;

    @JoinColumn(name = "employee_id")
    @ManyToOne
    private Employee employee;

}
