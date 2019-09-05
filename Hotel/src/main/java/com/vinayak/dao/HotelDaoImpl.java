package com.vinayak.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.vinayak.model.Address;
import com.vinayak.model.Hotel;

@Repository
public class HotelDaoImpl implements HotelDao {
@Autowired
SessionFactory sessionFactory;
	public Hotel addProperty(Hotel hotel) {
		Session session = sessionFactory.openSession();
		
		 Transaction trnx = session.beginTransaction();
		
		session.save(hotel);
		
		trnx.commit();
		
		session.close();
		return null;
		
	}
	public List<Hotel> viewProperties() {
		 List<Hotel> list=new ArrayList();
		 Session session = null;
		 session = sessionFactory.openSession();
		  Query q=session.createQuery("from Hotel");
		  
		  list=q.list();
		 System.out.println("list");
		 session.close();
		return list;
	}
	public List<Hotel> viewProp() {
		 List<Hotel> list=new ArrayList();
		 Session session = null;
		 session = sessionFactory.openSession();
		  Query q=session.createQuery("from Hotel");
		  
		  list=q.list();
		  session.close();
		return list;
	}
	public Address addingAddress(Address address) {
		Session session = sessionFactory.openSession();
		
		 Transaction trnx = session.beginTransaction();
		
		session.save(address);
		
		trnx.commit();
		
		session.close();
		return null;
	}
	public int addingAddressToProperty(int propertyId, int addressId) {
		System.out.println("add address dao 1");
		Session session = sessionFactory.openSession();
		
		 Transaction trnx = session.beginTransaction();
			System.out.println("add address dao 2");
		 Hotel hotel=(Hotel)session.get(Hotel.class, propertyId);
		 Address address=(Address)session.get(Address.class, addressId);
		 hotel.setAddress(address);
		 session.update(hotel);
		 trnx.commit();
			System.out.println("add address dao 3");
		return 0;
	}
 
 
	}


