package com.vinayak.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vinayak.dao.CustomerDaoImpl;
import com.vinayak.model.Booking;
import com.vinayak.model.Hotel;
import com.vinayak.model.Register;

public class CustomerServiceImpl implements CustomerService {
@Autowired
CustomerDaoImpl customerdao;
	public Register regEmployee(Register register) {
		 
		customerdao.regEmployee(register);
		return null;
	}
	public int checkLogin(String username, String password) {
		 int status = customerdao.checkLogin(username, password);
		 
		 return status;
	}
	public int adminLogin(String adminusername, String adminpassword) {
	 int status=customerdao.adminLogin(adminusername, adminpassword);
		return status;
	}
	public List<Hotel> viewPropertyByCity(String pcity) {
		 List<Hotel> list=new ArrayList<Hotel>();
		 list=customerdao.viewPropertyByCity(pcity);
		return list;
	}

	
	  public int booking(Booking booking) {
		  customerdao.booking(booking); 
		  return 0;
	  }
	 
	public Booking mappingRegisterIdToBookingId(Booking booking, int id) {
		 System.out.println("before mapping reg book");
		 customerdao.mappingRegisterIdToBookingId( booking,id);
		 System.out.println("after maooing reg book");
		return null;
	}
	public List<Hotel> allHotelAttributes() {
		List<Hotel> list=new ArrayList<Hotel>();
		list=customerdao.allHotelAttributes();
		return list;
	}
	public Hotel getPropertyById(int propertyId) {
		
		return  customerdao.getPropertyById(propertyId);
	}
	public Register getRegDetailsById(int registerId) {
		 
		return customerdao.getRegDetailsById(registerId);
	}

}
