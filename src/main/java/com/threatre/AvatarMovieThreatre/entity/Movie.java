package com.threatre.AvatarMovieThreatre.entity;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movie {

	// Define Fields
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="summary")
	private String summary;
	
	@Column(name="release_date")
	private String releaseDate;
	
	@Column(name="runtime")
	private String runTime;
	
	@Column(name="rating")
	private String rating;
	
	@Column(name="poster_url")
	private String posterURL;
	
	// OneToMany and JoinColumn
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="movie_id")
	private List<Genre> genreList;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="movie_id")
	private List<Cast> castList;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="movie_id")
	private List<Director> directorName;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="movie_id")
	private List<Writer> writerName;
	
	@OneToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="movie_id")
	private List<Showtime> showTime;
	
	// Constructor
	public Movie() {}

	public Movie(String title, String summary, String releaseDate, String runTime, String rating, String posterURL) {
		this.title = title;
		this.summary = summary;
		this.releaseDate = releaseDate;
		this.runTime = runTime;
		this.rating = rating;
		this.posterURL = posterURL;
	}

	// Setter/Getter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getRunTime() {
		return runTime;
	}

	public void setRunTime(String runTime) {
		this.runTime = runTime;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	public String getPosterURL() {
		return posterURL;
	}

	public void setPosterURL(String posterURL) {
		this.posterURL = posterURL;
	}

	public List<Genre> getGenreList() {
		return genreList;
	}

	public void setGenreList(List<Genre> genreList) {
		this.genreList = genreList;
	}

	public List<Cast> getCastList() {
		return castList;
	}

	public void setCastList(List<Cast> castList) {
		this.castList = castList;
	}

	public List<Director> getDirectorName() {
		return directorName;
	}

	public void setDirectorName(List<Director> directorName) {
		this.directorName = directorName;
	}

	public List<Writer> getWriterName() {
		return writerName;
	}

	public void setWriterName(List<Writer> writerName) {
		this.writerName = writerName;
	}

	public List<Showtime> getShowTime() {
		return showTime;
	}

	public void setShowTime(List<Showtime> showTime) {
		this.showTime = showTime;
	}
	
}
