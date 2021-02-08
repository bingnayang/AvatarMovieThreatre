package com.threatre.AvatarMovieThreatre.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ShowtimeDAOImplement implements ShowtimeDAO {
	// Define field for entitymanager
	private EntityManager entityManager;
	
	// Set up constructor injection
	@Autowired
	public ShowtimeDAOImplement(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
}
