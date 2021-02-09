package com.threatre.AvatarMovieThreatre.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.threatre.AvatarMovieThreatre.entity.Showtime;

@Repository
public class ShowtimeDAOImplement implements ShowtimeDAO {
	// Define field for entitymanager
	private EntityManager entityManager;
	
	// Set up constructor injection
	@Autowired
	public ShowtimeDAOImplement(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public Showtime findShowTimeById(int showtimeId) {
		// Get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		Showtime theShowtime = currentSession.get(Showtime.class, showtimeId);
		return theShowtime;
	}
}
