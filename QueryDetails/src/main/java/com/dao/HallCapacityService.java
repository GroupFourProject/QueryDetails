package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Hall;
import com.model.HallCapacity;

@Service
public class HallCapacityService {
@Autowired
HallCapacityDAO hall;
public void addHallCap(HallCapacity h) {
	hall.addHallCapacity(h);
}
public HallCapacity findHallCap(int id) {
	return hall.findCapacity(id);
}
public List<HallCapacity> findAllHallCap(){
	return hall.findALl();
}
public boolean update(HallCapacity h) {
	return hall.update(h);
}
public boolean delete(int id) {
	return hall.delete(id);
}
}
