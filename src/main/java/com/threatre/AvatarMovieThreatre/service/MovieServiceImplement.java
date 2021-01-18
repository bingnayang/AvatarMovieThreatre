package com.threatre.AvatarMovieThreatre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.threatre.AvatarMovieThreatre.dao.MovieDAO;

@Service
public class MovieServiceImplement implements MovieService{
	private MovieDAO movieDAO;

	@Autowired
	public MovieServiceImplement(MovieDAO movieDAO) {
		this.movieDAO = movieDAO;
	}
	
}
