package com.threatre.AvatarMovieThreatre.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.threatre.AvatarMovieThreatre.entity.FoodDrink;
import com.threatre.AvatarMovieThreatre.service.FoodDrinkService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class FoodDrinkRESTController {
	private FoodDrinkService foodDrinkService;

	@Autowired
	public FoodDrinkRESTController(FoodDrinkService foodDrinkService) {
		this.foodDrinkService = foodDrinkService;
	}
	
	@GetMapping("/food-drink")
	public List<FoodDrink> findAllFoodDrink(){
		return foodDrinkService.getAllFoodDrink();
	}
	
}
