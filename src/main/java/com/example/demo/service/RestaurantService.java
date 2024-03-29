package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.dto.RestaurantDTO;
import com.example.demo.entity.Restaurant;
import com.example.demo.mapper.RestaurantMapper;
import com.example.demo.repo.RestaurantRepo;

import jakarta.transaction.Transactional;

@Service
public class RestaurantService {
	
	@Autowired
	RestaurantRepo restaurantRepo;

	public List<RestaurantDTO> findAllRestaurant() {
		List<Restaurant>restaurants=restaurantRepo.findAll();
		// map it to list of Dtos
		
		List<RestaurantDTO>restaurantDTOList=restaurants.stream().map(restaurant->RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(restaurant)).collect(Collectors.toList());
		return restaurantDTOList;
	}
	
	
	public RestaurantDTO addRestaurentInDB(RestaurantDTO restaurantDTO) {
	Restaurant saveRestaurant=restaurantRepo.save(RestaurantMapper.INSTANCE.mapRestaurantDTOToRestaurant(restaurantDTO));
		return RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(saveRestaurant);
	}


	public ResponseEntity<RestaurantDTO> fetchRestaurentById(Integer id) {
	Optional<Restaurant> restaurent=restaurantRepo.findById(id);
	if (restaurent.isPresent()) {
		return new ResponseEntity<>(RestaurantMapper.INSTANCE.mapRestaurantToRestaurantDTO(restaurent.get()), HttpStatus.OK);
	}
		return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	}
	
}
