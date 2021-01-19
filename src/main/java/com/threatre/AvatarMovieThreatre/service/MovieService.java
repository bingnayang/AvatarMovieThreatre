package com.threatre.AvatarMovieThreatre.service;

import java.util.List;

import com.threatre.AvatarMovieThreatre.entity.Movie;

public interface MovieService {

	List<Movie> getAllMovieList();

	Movie getMovieById(int movieId);

}
