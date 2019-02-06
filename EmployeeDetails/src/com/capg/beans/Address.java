package com.capg.beans;

public class Address {
	@Override
	public String toString() {
		return "Address [addressLine=" + addressLine + ", country=" + country + "]";
	}
	private String addressLine;
	private Country country;
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public Address(String addressLine, Country country) {
		super();
		this.addressLine = addressLine;
		this.country = country;
	}

}
