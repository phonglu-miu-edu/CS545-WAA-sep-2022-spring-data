package edu.miu.lab3.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Float price;
    private Integer rating;

    @ManyToOne
    private Category category;

    @ManyToMany
    private List<ProductType> productTypes;

}
