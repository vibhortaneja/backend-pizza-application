package com.example.pizza.repository;

import com.example.pizza.entity.PizzaDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaDetailsRepository extends JpaRepository<PizzaDetails,Long> {

}
