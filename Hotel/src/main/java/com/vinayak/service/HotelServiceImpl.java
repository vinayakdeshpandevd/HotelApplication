package com.vinayak.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vinayak.dao.HotelDaoImpl;
import com.vinayak.model.Address;
import com.vinayak.model.Hotel;

public class HotelServiceImpl implements HotelService {
	
	@Autowired
	HotelDaoImpl hoteldao;

	public Hotel addProperty(Hotel hotel) {
	 hoteldao.addProperty(hotel);
		return null;
	}

	public List<Hotel> viewProperties() {
		List<Hotel> list=new ArrayList<Hotel>();
		list=hoteldao.viewProperties();
		return list;
	}

	public List<Hotel> viewProp() {
		List<Hotel> list=new ArrayList<Hotel>();
		list=hoteldao.viewProp();
		return list;
	}

	public Address addingAddress(Address address) {
		hoteldao.addingAddress(address);
		return null;
	}

	public int addingAddressToProperty(int propertyId,int addressId) {
		System.out.println("add address service 1");
		hoteldao.addingAddressToProperty(propertyId, addressId);
		System.out.println("add address service 2");
		return 0;
	}

}
