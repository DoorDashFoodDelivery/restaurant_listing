package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.RestaurantDTO;
import com.example.demo.service.RestaurantService;

@RestController
@RequestMapping("/restaurant")
public class RestaurantController {

	@Autowired
	RestaurantService restaurantService;
	
	
	@GetMapping("/fetchAllRestaurant")
	public ResponseEntity<List<RestaurantDTO>> fetchAllRestaurant(){
		
		List<RestaurantDTO> allRestaurants 	=restaurantService.findAllRestaurant();
		return new ResponseEntity<>(allRestaurants, HttpStatus.OK);
		
	}
	
	
	
}
