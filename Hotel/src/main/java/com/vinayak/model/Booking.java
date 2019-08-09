package com.vinayak.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int bookingId;
	
	
	  @Column private int registerId;
	 
	
	@Column
private String roomType;
	
	 @Column
private int numberOfAdults;
	
	@Column
private int numberOfChildren;
	
	 
	  
	  @OneToOne(cascade = CascadeType.ALL , targetEntity = Register.class)  
	 private Register register;
	 
	  
	
	
public int getBookingId() {
	return bookingId;
}
public void setBookingId(int bookingId) {
	this.bookingId = bookingId;
}
public String getRoomType() {
	return roomType;
}
public void setRoomType(String roomType) {
	this.roomType = roomType;
}
 
 
public int getNumberOfAdults() {
	return numberOfAdults;
}
public void setNumberOfAdults(int numberOfAdults) {
	this.numberOfAdults = numberOfAdults;
}
public int getNumberOfChildren() {
	return numberOfChildren;
}
public void setNumberOfChildren(int numberOfChildren) {
	this.numberOfChildren = numberOfChildren;
}

	
	  public int getRegisterId() { 
		  return registerId; 
		  } 
	  public void setRegisterId(int registerId) { this.registerId = registerId; }
	 
public Register getRegister() {
	return register;
}
public void setRegister(Register register) {
	this.register = register;
}
 

}
