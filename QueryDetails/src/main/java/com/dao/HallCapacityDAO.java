package com.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.model.HallCapacity;

@Repository
public interface HallCapacityDAO {
public void addHallCapacity(HallCapacity h);
public HallCapacity findCapacity(int id);
public List<HallCapacity> findALl();
public boolean update(HallCapacity h);
public boolean delete(int id);
}
