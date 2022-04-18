package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.Hall;
import com.model.Movies;

@Repository
public interface HallDAO {
	public void addHall(Hall halls);
	public Hall findHalls(int id);
	public List<Hall> findAllHalls();
	public boolean updateHall(Hall hall);
	public boolean deleteHalls(int id);
	
}
