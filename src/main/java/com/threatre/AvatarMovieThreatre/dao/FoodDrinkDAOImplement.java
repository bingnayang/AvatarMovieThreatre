package com.threatre.AvatarMovieThreatre.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.threatre.AvatarMovieThreatre.entity.FoodDrink;

@Repository
public class FoodDrinkDAOImplement implements FoodDrinkDAO {
	// Define field for entitymanager
	private EntityManager entityManager;

	// Set up constructor injection
	@Autowired
	public FoodDrinkDAOImplement(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<FoodDrink> getAllFoodDrink() {
		// Get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Create a query
		// Using native Hibernate API
		Query<FoodDrink> theQuery = currentSession.createQuery("from FoodDrink",FoodDrink.class);
		
		// Execute query and get result list
		List<FoodDrink> foodDrinkList = theQuery.getResultList();
		
		// Return the result
		return foodDrinkList;
	}
	
	
}
