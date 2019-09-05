package com.vinayak.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.vinayak.model.Address;
import com.vinayak.model.Booking;
import com.vinayak.model.Hotel;
import com.vinayak.model.Register;
@Repository
public class CustomerDaoImpl implements CustomerDao {
@Autowired
SessionFactory sessionFactory;
	public Register regEmployee(Register register) {
Session session = sessionFactory.openSession();
		
		 Transaction trnx = session.beginTransaction();
		
		session.save(register);
		
		trnx.commit();
		
		session.close();
		System.out.println("Regiser id in dao IMPL is: "+register.getId());
		return register;
		 
	}
	 public int checkLogin(String username, String password){
			System.out.println("In Check login");
			Session session = sessionFactory.openSession();
			 
			 
			String q =" from Register as reg where reg.username=:username and reg.password=:password";
			Query query = session.createQuery(q);
			query.setParameter("username",username);
			query.setParameter("password",password);
			
			System.out.println(" unique result value = "+query.uniqueResult());	
			
			if(query.uniqueResult() == null)
			{
				return -1;
			}
			else
			{
				return 1;
			}
			
			
			
	 }
	public int adminLogin(String adminusername, String adminpassword) {
		 if(adminusername.contentEquals("admin")&&adminpassword.equals("admin")) {
			 return 1;
		 }
		 else
		return -1;
	}
	public List<Hotel> viewPropertyByCity(String pcity) {
		 List<Hotel> list=new ArrayList();
		 Session session = null;
		 session = sessionFactory.openSession();
		  Query q=session.createQuery("from Hotel h where h.pcity=:pc");
	q.setParameter("pc", pcity);
	list=q.list();
		return list;
	}

	
	  public int booking(Booking booking) { 
		  Session session = sessionFactory.openSession();
	  
	  Transaction trnx = session.beginTransaction();
	  
	  session.save(booking);
	  
	  trnx.commit();
	  
	  session.close();
	  return 0; 
	  }
	 
public Booking mappingRegisterIdToBookingId(Booking booking, int id) {
		Session session = sessionFactory.openSession();
		
		 Transaction trnx = session.beginTransaction();
			System.out.println("map book reg dao 2");
		 
		 Register register=(Register)session.get(Register.class, id);
		 booking.setRegister(register);
		session.update(booking);
		// session.save(booking);
		 trnx.commit();
			System.out.println("map book reg dao 3");
		return null;
	}
	public List<Hotel> allHotelAttributes() {
		 List<Hotel> list=new ArrayList();
		 Session session = null;
		 session = sessionFactory.openSession();
		  Query q=session.createQuery("from Hotel");
		  
		  list=q.list();
		 System.out.println("list");
		 session.close();
		return list;
	}
	public Hotel getPropertyById(int propertyId) {
		Session session = sessionFactory.openSession();
		 
		 Hotel hotel=(Hotel)session.get(Hotel.class, propertyId);
		 session.close();
		 System.out.println("hotel object in dao  "+hotel);
		return hotel;
	}
	public Register getRegDetailsById(int registerId) {
		Session session = sessionFactory.openSession();
		Register register=(Register)session.get(Register.class, registerId);
		 session.close();
		return register;
	}
	
	

}
