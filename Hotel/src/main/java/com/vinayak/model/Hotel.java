package com.vinayak.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Controller;


@Entity
@org.hibernate.annotations.Entity
@Table
public class Hotel {
  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
  private int propertyId;
	
	@Column
  private String propertyName;
	
	@Column
  private long propertyCode;
	
	@Column
private float starRating;
	
	@Column
private int maxRoomsAvailable;
	
	@Column
	private String pcity;
	
	@OneToOne(cascade = CascadeType.ALL , targetEntity = Address.class)
private Address address;
public int getPropertyId() {
	return propertyId;
}
public void setPropertyId(int propertyId) {
	this.propertyId = propertyId;
}
public String getPropertyName() {
	return propertyName;
}
public void setPropertyName(String propertyName) {
	this.propertyName = propertyName;
}
public long getPropertyCode() {
	return propertyCode;
}
public void setPropertyCode(long propertyCode) {
	this.propertyCode = propertyCode;
}
public float getStarRating() {
	return starRating;
}
public void setStarRating(float starRating) {
	this.starRating = starRating;
}
public int getMaxRoomsAvailable() {
	return maxRoomsAvailable;
}
public void setMaxRoomsAvailable(int maxRoomsAvailable) {
	this.maxRoomsAvailable = maxRoomsAvailable;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	this.address = address;
}
public String getPcity() {
	return pcity;
}
public void setPcity(String pcity) {
	this.pcity = pcity;
}


}
