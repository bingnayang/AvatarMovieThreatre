package com.threatre.AvatarMovieThreatre.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.threatre.AvatarMovieThreatre.dao.FoodDrinkDAO;
import com.threatre.AvatarMovieThreatre.entity.FoodDrink;

@Service
public class FoodDrinkServiceImplement implements FoodDrinkService {
	private FoodDrinkDAO foodDrinkDAO;

	@Autowired
	public FoodDrinkServiceImplement(FoodDrinkDAO foodDrinkDAO) {
		this.foodDrinkDAO = foodDrinkDAO;
	}

	@Override
	@Transactional
	public List<FoodDrink> getAllFoodDrink() {
		return foodDrinkDAO.getAllFoodDrink();
	}
	
	
}
