package com.threatre.AvatarMovieThreatre.dao;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MovieDAOImplement implements MovieDAO {
	// Define field for entitymanager
	private EntityManager entityManager;

	// Set up constructor injection
	@Autowired
	public MovieDAOImplement(EntityManager entityManager) {
		this.entityManager = entityManager;
	}
	
}
