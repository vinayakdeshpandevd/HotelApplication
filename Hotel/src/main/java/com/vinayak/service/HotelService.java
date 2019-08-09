package com.vinayak.service;

import java.util.List;

import com.vinayak.model.Address;
import com.vinayak.model.Hotel;

public interface HotelService {
public Hotel addProperty(Hotel hotel);
public List<Hotel> viewProperties();
public List<Hotel> viewProp();
public Address addingAddress(Address address);
public int addingAddressToProperty(int propertyId, int addressId);
}
