package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class HallCapacity {
	@Id
private int hallId;
private int seatTypeId;
private int seatCount;
public HallCapacity() {}
public int getHallId() {
	return hallId;
}
public void setHallId(int hallId) {
	this.hallId = hallId;
}
public int getSeatTypeId() {
	return seatTypeId;
}
public void setSeatTypeId(int seatTypeId) {
	this.seatTypeId = seatTypeId;
}
public int getSeatCount() {
	return seatCount;
}
public void setSeatCount(int seatCount) {
	this.seatCount = seatCount;
}

}
