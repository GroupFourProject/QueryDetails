package com.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Hall {
@Id
@GeneratedValue
private int hallId;
private String hallName;
private int totalCapacity;
@OneToMany(mappedBy = "hall",cascade = CascadeType.ALL)
private List<Show> show;
public Hall() {}
public List<Show> getShow() {
	return show;
}
public void setShow(List<Show> show) {
	this.show = show;
}

public int getHallId() {
	return hallId;
}
public void setHallId(int hallId) {
	this.hallId = hallId;
}
public String getHallName() {
	return hallName;
}
public void setHallName(String hallName) {
	this.hallName = hallName;
}
public int getTotalCapacity() {
	return totalCapacity;
}
public void setTotalCapacity(int totalCapacity) {
	this.totalCapacity = totalCapacity;
}

}
