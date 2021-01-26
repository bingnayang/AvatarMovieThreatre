package com.threatre.AvatarMovieThreatre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.threatre.AvatarMovieThreatre.dao.FoodDrinkDAO;

@Service
public class FoodDrinkServiceImplement implements FoodDrinkService {
	private FoodDrinkDAO foodDrinkDAO;

	@Autowired
	public FoodDrinkServiceImplement(FoodDrinkDAO foodDrinkDAO) {
		this.foodDrinkDAO = foodDrinkDAO;
	}
	
	
}
