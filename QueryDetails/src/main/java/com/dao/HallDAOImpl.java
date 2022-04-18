package com.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.*;


@Component  
public class HallDAOImpl implements HallDAO {

	
	
	@Autowired
	SessionFactory sessionFactory;

	@Override
	public void addHall(Hall halls) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.save(halls);
		session.flush();
		session.getTransaction().commit();
		session.close();
		
	}

	@Override
	public Hall findHalls(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Hall halls=session.find(Hall.class,id);
		return halls;
	}

	@Override
	public List<Hall> findAllHalls() {
		Session session=sessionFactory.openSession();
	    List<Hall> hallList=session.createQuery("select i from Hall i").list();
		return hallList;
	}

	@Override
	public boolean updateHall(Hall hall) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		session.getTransaction().begin();
		session.update(hall);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}

	@Override
	public boolean deleteHalls(int id) {
		// TODO Auto-generated method stub
		Session session=sessionFactory.openSession();
		Hall hall=session.find(Hall.class,id);
		session.getTransaction().begin();
		session.delete(hall);
		session.flush();
		session.getTransaction().commit();
		session.close();
		return true;
	}
	
}

 


