package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.HallCapacity;

@Component
public class HallCapacityDAOImpl implements HallCapacityDAO {
@Autowired
SessionFactory sessionFactory;

@Override
public void addHallCapacity(HallCapacity h) {
	Session session= sessionFactory.openSession();
	session.getTransaction().begin();
	session.save(h);
	session.flush();
	session.getTransaction().commit();
	session.close();
}

@Override
public HallCapacity findCapacity(int id) {
	// TODO Auto-generated method stub
	Session session=sessionFactory.openSession();
	HallCapacity h = session.find(HallCapacity.class,id);
	return h;
}

@Override
public List<HallCapacity> findALl() {
	// TODO Auto-generated method stub
	Session session= sessionFactory.openSession();
	List<HallCapacity> l=session.createQuery("select i from hallcapacity i").list();
	return l;
}

@Override
public boolean update(HallCapacity h) {
	// TODO Auto-generated method stub
	Session session=sessionFactory.openSession();
	session.getTransaction().begin();
	session.update(h);
	session.flush();
	session.getTransaction().commit();
	session.close();
	return true;
}

@Override
public boolean delete(int id) {
	// TODO Auto-generated method stub
	Session session= sessionFactory.openSession();
    HallCapacity h = session.find(HallCapacity.class, id);
    session.getTransaction().begin();
    session.delete(h);
    session.flush();
    session.getTransaction().commit();
    session.close();
	return true;
}

}
