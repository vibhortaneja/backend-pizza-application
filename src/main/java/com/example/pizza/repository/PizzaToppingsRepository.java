package com.example.pizza.repository;

import com.example.pizza.entity.PizzaToppings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaToppingsRepository extends JpaRepository<PizzaToppings,Long> {

}
