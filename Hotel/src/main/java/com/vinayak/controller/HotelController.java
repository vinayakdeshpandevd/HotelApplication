package com.vinayak.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.vinayak.dao.HotelDaoImpl;
import com.vinayak.email.AwsSimpleEmailService;
import com.vinayak.model.Address;
import com.vinayak.model.Hotel;
import com.vinayak.model.Register;
import com.vinayak.service.CustomerServiceImpl;
import com.vinayak.service.HotelServiceImpl;

@Controller
public class HotelController {
	
	@Autowired
	HotelServiceImpl hotelservice;
	
	@RequestMapping("/propReg")
	public String propertyRegistration(Model model) {
		model.addAttribute("hotel", new Hotel());
		System.out.println("prop reg controller");
		return "propertyRegistration.jsp";
		
	}
	@RequestMapping(value="/propRegDone",  method=RequestMethod.POST)
	public String propertyRegSuccess(@ModelAttribute("hotel") Hotel hotel) {
		hotelservice.addProperty(hotel);
		return "redirect:/viewProperty";
		
	}
	@RequestMapping(value="/viewProperty",  method=RequestMethod.GET)
	public String viewProperty(Model model) {
		List<Hotel> hotel=new ArrayList();
		hotel=hotelservice.viewProperties();
		model.addAttribute("hotel",hotel );
		return "viewProperties.jsp";
		
	}
	
	@RequestMapping(value="/viewProp",  method=RequestMethod.GET)
	public String viewProp(Model model) {
		List<Hotel> hotel=new ArrayList();
		hotel=hotelservice.viewProp();
		model.addAttribute("hotel",hotel );
		return "viewProp.jsp";
		
	}
	@RequestMapping("/addAddress")
	public String addingAddress(Model model) {
		model.addAttribute("address", new Address());
		return "addAddress.jsp";
		
	}
	
	 @RequestMapping(value="/addedAddress", method=RequestMethod.POST)
	 public String addingAddr(@ModelAttribute("address") Address address) {
		 System.out.println("Address adding controller");
		 hotelservice.addingAddress(address);
		return "addedAddress.jsp";
		 
	 }
	 
	 @RequestMapping("/addAddressToProperty")
	 public String addAddressProp(HttpServletRequest req) {
		  int propertyId=Integer.parseInt(req.getParameter("propertyId"));
		  int addressId=Integer.parseInt(req.getParameter("addressId"));
		  System.out.println("before moving to service in add adress to property controller");
		  hotelservice.addingAddressToProperty(propertyId, addressId);
		  System.out.println("add address to property");
		return "addedAddressToProperty.jsp";
}
	 
	 @RequestMapping("/mail")
	 public String mail() {
		 AwsSimpleEmailService ases=new AwsSimpleEmailService();
		 try {
			ases.awsMail();
		} catch (Exception e) {
			 
			e.printStackTrace();
		}
		return "sentSuccess.jsp";
	 
	}
}
	 
	

