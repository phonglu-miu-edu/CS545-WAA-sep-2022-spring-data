package edu.miu.lab3.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class EmployeeProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_profile_id")
    private int id;
    private String gender;
    private int birthYear;

    @JoinColumn(name = "employee_id")
    @OneToOne
    private Employee employee;

}
