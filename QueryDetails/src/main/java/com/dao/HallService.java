package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Hall;

@Service
public class HallService {
@Autowired
HallDAO hallDAOImpl;
public void add(Hall hall) {
	hallDAOImpl.addHall(hall);
}
public Hall findHall(int id) {
	return hallDAOImpl.findHalls(id);
}
public List<Hall> findAll(){
	return hallDAOImpl.findAllHalls();
}
public boolean update(Hall hall) {
	return hallDAOImpl.updateHall(hall);
}
public boolean delete(int id) {
	return hallDAOImpl.deleteHalls(id);
}
}
