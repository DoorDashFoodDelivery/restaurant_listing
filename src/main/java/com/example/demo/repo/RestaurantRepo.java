package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Restaurant;

public interface RestaurantRepo extends JpaRepository<Restaurant,Integer> {

}
