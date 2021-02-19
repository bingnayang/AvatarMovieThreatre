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
	
	@Column(name="adult_price")
	private double adultPrice;
	
	@Column(name="senior_price")
	private double seniorPrice;
	
	@Column(name="child_price")
	private double childPrice;
		
	// Define Constructors
	public Showtime() {}
	
	public Showtime(int movie_id, String showDate, String startTime, String auditorium, double adultPrice,
			double seniorPrice, double childPrice) {
		this.movie_id = movie_id;
		this.showDate = showDate;
		this.startTime = startTime;
		this.auditorium = auditorium;
		this.adultPrice = adultPrice;
		this.seniorPrice = seniorPrice;
		this.childPrice = childPrice;
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

	public double getAdultPrice() {
		return adultPrice;
	}

	public void setAdultPrice(double adultPrice) {
		this.adultPrice = adultPrice;
	}

	public double getSeniorPrice() {
		return seniorPrice;
	}

	public void setSeniorPrice(double seniorPrice) {
		this.seniorPrice = seniorPrice;
	}

	public double getChildPrice() {
		return childPrice;
	}

	public void setChildPrice(double childPrice) {
		this.childPrice = childPrice;
	}
	
}
