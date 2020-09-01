package com.example.pizza.repository;

import com.example.pizza.entity.PizzaDetails;
import com.example.pizza.entity.PizzaPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaPriceRepository extends JpaRepository<PizzaPrice,Long> {

}
