package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.RestaurantDTO;
import com.example.demo.entity.Restaurant;
import com.example.demo.repo.RestaurantRepo;

@Service
public class RestaurantService {
	
	@Autowired
	RestaurantRepo restaurantRepo;

	public List<RestaurantDTO> findAllRestaurant() {
		List<Restaurant>restaurant=restaurantRepo.findAll();
		// map it to list of Dtos
		return null;
	}
	
}
