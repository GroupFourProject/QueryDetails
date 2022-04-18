package com.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class Show {
	@Id
	@GeneratedValue
private int showId;
	
private int hallID;

private int movieID;

private int slotNO;
@JsonFormat(pattern="dd-mm-yyyy")
private Date fromDate;
@JsonFormat(pattern="dd-mm-yyyy")
private Date toDate;
@ManyToOne
private Movies movie;
@ManyToOne
private Hall hall;

public Show() {}




@Override
public String toString() {
	return "Show [showId=" + showId + ", hallID=" + hallID + ", movieID=" + movieID + ", slotNO=" + slotNO
			+ ", fromDate=" + fromDate + ", toDate=" + toDate + ", movie=" + movie + ", hall=" + hall + "]";
}




public Movies getMovie() {
	return movie;
}




public void setMovie(Movies movie) {
	this.movie = movie;
}




public Hall getHall() {
	return hall;
}




public void setHall(Hall hall) {
	this.hall = hall;
}




public int getShowId() {
	return showId;
}


public void setShowId(int showId) {
	this.showId = showId;
}


public int getHallID() {
	return hallID;
}

public void setHallID(int hallID) {
	this.hallID = hallID;
}

public int getMovieID() {
	return movieID;
}

public void setMovieID(int movieID) {
	this.movieID = movieID;
}

public int getSlotNO() {
	return slotNO;
}

public void setSlotNO(int slotNO) {
	this.slotNO = slotNO;
}

public Date getFromDate() {
	return fromDate;
}

public void setFromDate(Date fromDate) {
	this.fromDate = fromDate;
}

public Date getToDate() {
	return toDate;
}

public void setToDate(Date toDate) {
	this.toDate = toDate;
}


}
