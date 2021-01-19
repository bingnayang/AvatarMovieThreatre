package com.threatre.AvatarMovieThreatre.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.threatre.AvatarMovieThreatre.dao.MovieDAO;
import com.threatre.AvatarMovieThreatre.entity.Movie;

@Service
public class MovieServiceImplement implements MovieService{
	private MovieDAO movieDAO;

	@Autowired
	public MovieServiceImplement(MovieDAO movieDAO) {
		this.movieDAO = movieDAO;
	}

	@Override
	@Transactional
	public List<Movie> getAllMovieList() {
		return movieDAO.getAllMovieList();
	}

	@Override
	@Transactional
	public Movie getMovieById(int movieId) {
		return movieDAO.getMovieById(movieId);
	}
	
}
