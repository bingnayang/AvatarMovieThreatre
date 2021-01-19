package com.threatre.AvatarMovieThreatre.dao;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Session;
import com.threatre.AvatarMovieThreatre.entity.Movie;

@Repository
public class MovieDAOImplement implements MovieDAO {
	// Define field for entitymanager
	private EntityManager entityManager;

	// Set up constructor injection
	@Autowired
	public MovieDAOImplement(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Movie> getAllMovieList() {
		// Get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		// Create a query
		// Using native Hibernate API
		Query<Movie> theQuery = currentSession.createQuery("from Movie",Movie.class);
		
		// Execute query and get result list
		List<Movie> movieList = theQuery.getResultList();
		
		// Return the result
		return movieList;
	}

	@Override
	public Movie getMovieById(int movieId) {
		// Get the current hibernate session
		Session currentSession = entityManager.unwrap(Session.class);
		
		Movie theMovie = currentSession.get(Movie.class, movieId);
		
		// Return the result
		return theMovie;
	}
	
}
