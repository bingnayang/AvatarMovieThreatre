package com.threatre.AvatarMovieThreatre.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.threatre.AvatarMovieThreatre.entity.Movie;
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
	
	// GET "/movie" - return list of movies
	@GetMapping("/movies")
	public List<Movie> findAllMuseum(){
		return movieService.getAllMovieList();
	}
	
	// GET "/movies/{movieId} - return a movie by Id
	@GetMapping("/movies/{movieId}")
	public Movie findMovieById(@PathVariable int movieId) {
		Movie theMovie = movieService.getMovieById(movieId);
		if(theMovie == null) {
			throw new RuntimeException("Movie not found");
		}
		return theMovie;
	}
	
}
