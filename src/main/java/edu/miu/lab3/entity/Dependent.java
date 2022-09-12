package edu.miu.lab3.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Dependent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int dependentId;
    private String fname;
    private String relationship;

    @ManyToOne
    private Employee employee;

}
