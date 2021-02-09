package com.threatre.AvatarMovieThreatre.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="showtimes")
public class Showtime {

	// Define Fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="movie_id")
	private int movie_id;
	
	@Column(name="show_date")
	private String showDate;
	
	@Column(name="start_time")
	private String startTime;
	
	@Column(name="auditorium")
	private String auditorium;
		
	// Define Constructors
	public Showtime() {}
	
	public Showtime(String showDate, String startTime, String auditorium, int movie_id) {
		this.showDate = showDate;
		this.startTime = startTime;
		this.auditorium = auditorium;
		this.movie_id = movie_id;
	}

	// Define Setter/Getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getShowDate() {
		return showDate;
	}

	public void setShowDate(String showDate) {
		this.showDate = showDate;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getAuditorium() {
		return auditorium;
	}

	public void setAuditorium(String auditorium) {
		this.auditorium = auditorium;
	}

	public int getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(int movie_id) {
		this.movie_id = movie_id;
	}
	
}
