package com.ibrahim.model;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String region;
	private String state;
	private String city;
	private String street;
	private int pinCode;
	
	public Address() {
		super();
	}

	public Address(String region, String state, String city, String street, int pinCode) {
		super();
		this.region = region;
		this.state = state;
		this.city = city;
		this.street = street;
		this.pinCode = pinCode;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [region=" + region + ", state=" + state + ", city=" + city + ", street=" + street + ", pinCode="
				+ pinCode + "]";
	}
	
	
}
