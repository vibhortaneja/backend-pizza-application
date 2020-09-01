package com.example.pizza.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Entity
//Marks this class as an entity bean, so it must have a no-argument constructor that is visible with at least protected scope.
@Table(name = "pizza_price_entity")
//Allows you to specify the details of the table that will be used to persist the entity in the database.
@Getter
@Setter
public class PizzaPrice {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "size")
    private String size;

    @Column(name = "price")
    private Long price;

    @ManyToOne
    @JoinColumn(name="pizzaid")
    private PizzaDetails pizzaDetails;

}
