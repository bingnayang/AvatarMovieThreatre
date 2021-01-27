package com.threatre.AvatarMovieThreatre.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="auditoriums")
public class Auditorium {
	
	// Define Fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="auditorium_type")
	private String auditoriumType;
	
	@Column(name="seat_available")
	private String seatAvailable;	
	
	// Define Constructors
	public Auditorium() {}

	public Auditorium(String auditoriumType, String seatAvailable) {
		this.auditoriumType = auditoriumType;
		this.seatAvailable = seatAvailable;
	}

	// Define Setter/Getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuditoriumType() {
		return auditoriumType;
	}

	public void setAuditoriumType(String auditoriumType) {
		this.auditoriumType = auditoriumType;
	}

	public String getSeatAvailable() {
		return seatAvailable;
	}

	public void setSeatAvailable(String seatAvailable) {
		this.seatAvailable = seatAvailable;
	}
	
	
}
