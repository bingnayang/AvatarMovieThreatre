package com.threatre.AvatarMovieThreatre.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.threatre.AvatarMovieThreatre.dao.ShowtimeDAO;
import com.threatre.AvatarMovieThreatre.entity.Showtime;

@Service
public class ShowtimeServiceImplement implements ShowtimeService {
	private ShowtimeDAO showtimeDAO;
	
	@Autowired
	public ShowtimeServiceImplement(ShowtimeDAO showtimeDAO) {
		this.showtimeDAO = showtimeDAO;
	}

	@Override
	@Transactional
	public Showtime findShowTimeById(int showtimeId) {
		return showtimeDAO.findShowTimeById(showtimeId);
	}
}
