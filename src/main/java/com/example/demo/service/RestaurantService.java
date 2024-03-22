package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.RestaurantRepo;

@Service
public class RestaurantService {
	@Autowired
	RestaurantRepo restaurantRepo;
}
