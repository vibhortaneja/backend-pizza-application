package com.example.pizza.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.util.List;

@Entity
//Marks this class as an entity bean, so it must have a no-argument constructor that is visible with at least protected scope.
@Table(name = "pizza_details_entity")
//Allows you to specify the details of the table that will be used to persist the entity in the database.
@Getter
@Setter
public class PizzaDetails {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "type")
    private String type;

    @Type(type = "com.vladmihalcea.hibernate.type.array.IntArrayType")
    @Column(name = "toppingids")
    private Integer[] toppingids;

    @OneToMany(mappedBy = "pizzaDetails", cascade =  CascadeType.ALL)
    private List<PizzaPrice> prices;
}
