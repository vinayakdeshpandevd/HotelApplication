package com.vinayak.dao;

import java.util.List;

import com.vinayak.model.Booking;
import com.vinayak.model.Hotel;
import com.vinayak.model.Register;

public interface CustomerDao {
public Register regEmployee(Register register);
public int checkLogin(String username, String password);
public int adminLogin(String adminusername,String adminpassword);
public List<Hotel> viewPropertyByCity(String pcity);
public int booking(Booking booking);
public Booking mappingRegisterIdToBookingId(Booking booking,int id);
public List<Hotel> allHotelAttributes();
public Hotel getPropertyById(int propertyId);
public Register getRegDetailsById(int registerId);
}
