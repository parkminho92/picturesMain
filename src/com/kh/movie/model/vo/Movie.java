package com.kh.movie.model.vo;

import java.sql.Date;

public class Movie {
	/* MOVIE_NO */
	private int movieNo;

	/* TITLE */
	private String title;

	/* RUNTIME */
	private int runtime;

	/* DIRECTOR */
	private String director;

	/* ACTOR */
	private String actor;

	/* AGE_LIMIT */
	private int ageLimit;

	/* SYNOPSIS */
	private String synopsis;

	/* ON_DATE */
	private Date onDate;

	/* STATUS */
	private String status;
	

	public Movie() {
		
	}

	public Movie(int movieNo, String title, int ageLimit) {
		super();
		this.movieNo = movieNo;
		this.title = title;
		this.ageLimit = ageLimit;
	}
  
	
	public Movie(String title, String director, String actor, Date onDate, int runtime, int ageLimit, String synopsis) {
		super();
		this.title = title;
		this.runtime = runtime;
		this.director = director;
		this.actor = actor;
		this.ageLimit = ageLimit;
		this.synopsis = synopsis;
		this.onDate = onDate;
	}
	
	public Movie(int movieNo, String title, int runtime, int ageLimit, Date onDate) {
		super();
		this.movieNo = movieNo;
		this.title = title;
		this.runtime = runtime;
		this.ageLimit = ageLimit;
		this.onDate = onDate;
	}
	
	public boolean isEquals(Integer movieNo) {
		if (movieNo == null) {
			return false;
		}
		return this.movieNo == movieNo.intValue();
	}

	public int getMovieNo() {
		return movieNo;
	}

	public void setMovieNo(int movieNo) {
		this.movieNo = movieNo;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getRuntime() {
		return runtime;
	}

	public void setRuntime(int runtime) {
		this.runtime = runtime;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	public int getAgeLimit() {
		return ageLimit;
	}

	public void setAgeLimit(int ageLimit) {
		this.ageLimit = ageLimit;
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}

	public Date getOnDate() {
		return onDate;
	}

	public void setOnDate(Date onDate) {
		this.onDate = onDate;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Movie [movieNo=" + movieNo + ", title=" + title + ", runtime=" + runtime + ", director=" + director
				+ ", actor=" + actor + ", ageLimit=" + ageLimit + ", synopsis=" + synopsis + ", onDate=" + onDate
				+ ", status=" + status + "]";
	}

	public boolean isEquals(Integer movieNo) {
		if (movieNo == null) {
			return false;
		}
		return this.movieNo == movieNo.intValue();
	}

}

