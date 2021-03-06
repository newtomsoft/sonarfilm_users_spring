package com.fr.sonarfilm.user.models;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class WantedMovies extends Movie {


	@ManyToMany(mappedBy = "userMovies",fetch = FetchType.LAZY)
	@JsonIgnore
    Set<UserSonarCinematicProfile> userCine;
		
		
		public WantedMovies() {}
	
	public WantedMovies(Long idMovie, String movieName, String year) {

		this.idMovie = idMovie;
		this.movieName = movieName;
		this.year = year;
	}


	public Set<UserSonarCinematicProfile> getUserCine() {
		return userCine;
	}

	public void setUserCine(Set<UserSonarCinematicProfile> userCine) {
		this.userCine = userCine;
	}

	
	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Long getIdMovie() {
		return idMovie;
	}

	public void setIdMovie(Long idMovie) {
		this.idMovie = idMovie;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	



	

}
