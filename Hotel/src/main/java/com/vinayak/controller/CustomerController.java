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

import com.vinayak.model.Booking;
import com.vinayak.model.Hotel;
import com.vinayak.model.Register;
import com.vinayak.service.CustomerServiceImpl;

@Controller
public class CustomerController {
@Autowired
CustomerServiceImpl customerservice;
@RequestMapping("/register")
public String register(Model model) {
	
	  System.out.println("register controller");
		 model.addAttribute("register", new Register());
		  
	return "register.jsp";
	 
}
@RequestMapping(value="/regDone", method=RequestMethod.POST)
public String registerCustomer(@ModelAttribute("register") Register register, Model model) {
	customerservice.regEmployee(register);
	System.out.println("reg done controller");
	System.out.println("Regiser id in Cust controller is : "+register.getId());
	 model.addAttribute("forRegisterId",register.getId()); //for sending register id to regSucId.jsp
	return "regSucId.jsp";
	
}
@RequestMapping("/customerLogin")
public String customerLogin(HttpServletRequest req,Register register) {
	System.out.println("customer login controller");
	String username=req.getParameter("username");
	String password=req.getParameter("password");
	int status = customerservice.checkLogin(username, password);
	
	if(status == 1 )
	{
	return "bookRooms.jsp";
	}
	else
	{
		return "index.jsp";
	}
	

}
@RequestMapping("/adminLogin")
public String adminLogin(HttpServletRequest req) {
	System.out.println("adminr login controller");
	String adminusername=req.getParameter("adminusername");
	String adminpassword=req.getParameter("adminpassword");
	customerservice.adminLogin(adminusername, adminpassword);
	return "adminHome.jsp";
	
}
@RequestMapping("/viewPropByCity")
public String viewPropertyByCity(HttpServletRequest req,Model model) {
	String pcity=req.getParameter("city");
	List<Hotel> hotel=new ArrayList();
	hotel=customerservice.viewPropertyByCity(pcity);
	model.addAttribute("hotel",hotel);
	return "viewProp.jsp";
	
}
@RequestMapping("/customerReq")
public String customerRequirement(Model model,HttpServletRequest req) {
	int propertyId=Integer.parseInt(req.getParameter("propertyId"));
	System.out.println("property id in customerReq method : "+propertyId);
	model.addAttribute("booking", new Booking());
	model.addAttribute("propertyId",propertyId );
	return "customerRequired.jsp";
	
}
@RequestMapping(value="/bookingDone", method=RequestMethod.POST)
public String bookingDone(@ModelAttribute("booking") Booking booking , HttpServletRequest req, Model model) {
	 int id=Integer.parseInt(req.getParameter("registerId"));
	 Register register=customerservice.getRegDetailsById(id);
	 System.out.println("booking");
	customerservice.booking(booking);
	// int bookingId=Integer.parseInt(req.getParameter("bookingId"));
	// System.out.println("Booking id is "+bookingId);
	customerservice.mappingRegisterIdToBookingId(booking, id);
	System.out.println("one one reg book");
		 
	model.addAttribute("booking",booking);
	int propertyId=Integer.parseInt (req.getParameter("propertyId"));
	System.out.println("propertyId is : " +propertyId);
	Hotel hotel=customerservice.getPropertyById(propertyId);
	System.out.println("hotel object is : " +hotel);
	model.addAttribute("hotel", hotel);
	model.addAttribute("register", register);
	return "bookingDone.jsp";
	
	
}
	
	/*
	 * @RequestMapping("/file") public void fileFormat() throws IOException{
	 * List<Hotel> h=new ArrayList(); h=customerservice.allHotelAttributes();
	 * FileWriter file= new FileWriter("E:\\HotelList.csv"); for (Hotel hotel : h) {
	 * System.out.println("details of hotels"+hotel);
	 * System.out.println(hotel.getPropertyName());
	 * file.write(hotel.getPropertyName()); file.write(",");
	 * file.write(hotel.getPcity());
	 * 
	 * file.write("\n");
	 * 
	 * } file.close(); }
	 */
	 

}

