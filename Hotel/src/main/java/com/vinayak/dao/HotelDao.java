package com.vinayak.dao;

import java.util.List;

import com.vinayak.model.Address;
import com.vinayak.model.Hotel;

public interface HotelDao {
	public Hotel addProperty(Hotel hotel);
	public List<Hotel> viewProperties();
	public List<Hotel> viewProp();
	public Address addingAddress(Address address);
	public int addingAddressToProperty(int propertyId,int addressId);
 }
