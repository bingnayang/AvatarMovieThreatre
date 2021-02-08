package com.threatre.AvatarMovieThreatre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.threatre.AvatarMovieThreatre.dao.ShowtimeDAO;

@Service
public class ShowtimeServiceImplement implements ShowtimeService {
	private ShowtimeDAO showtimeDAO;
	
	@Autowired
	public ShowtimeServiceImplement(ShowtimeDAO showtimeDAO) {
		this.showtimeDAO = showtimeDAO;
	}
}
