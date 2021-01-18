package com.threatre.AvatarMovieThreatre.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.threatre.AvatarMovieThreatre.service.MovieService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class MovieRESTController {
	private MovieService movieService;

	@Autowired
	public MovieRESTController(MovieService movieService) {
		this.movieService = movieService;
	}
	
}
