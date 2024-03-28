package com.example.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
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
	
}
