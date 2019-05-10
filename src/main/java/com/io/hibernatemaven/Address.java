package com.io.hibernatemaven;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class Address {

	@Column(name="USER_CITY")
	private String city;
	@Column(name="USER_STATE")
	private String state;
	@Column(name="USER_STREET")
	private String street;
	@Column(name="USER_PIN")
	private int pin;

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
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
}
