package com.vinayak.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table
@DynamicUpdate
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int addressId;
    
    @Column
	private long plotNo;
    
    @Column
	private String areaName;
    
    @Column
	private String city;
    
    @Column
	private String state;
    
    @Column
    private Integer pin;
	public int getAddressId() {
		return addressId;
	}
	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}
	public long getPlotNo() {
		return plotNo;
	}
	public void setPlotNo(long plotNo) {
		this.plotNo = plotNo;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getPin() {
		return pin;
	}
	public void setPin(Integer pin) {
		this.pin = pin;
	}
	
}
