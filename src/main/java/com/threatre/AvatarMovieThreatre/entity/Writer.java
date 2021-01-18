package com.threatre.AvatarMovieThreatre.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="writer")
public class Writer {
	// Define Fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="writer_name")
	private String writer_name;
	
	// Define Constructors
	public Writer() {}

	public Writer(String writer_name) {
		this.writer_name = writer_name;
	}

	// Define Setter/Getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getWriter_name() {
		return writer_name;
	}

	public void setWriter_name(String writer_name) {
		this.writer_name = writer_name;
	}
}
