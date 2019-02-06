package com.capg.beans;

public class Country {
	private String coNmae;
	private City city;
	public Country(String coNmae, City city) {
		super();
		this.coNmae = coNmae;
		this.city = city;
	}
	public String getCoNmae() {
		return coNmae;
	}
	public void setCoNmae(String coNmae) {
		this.coNmae = coNmae;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Country [coNmae=" + coNmae + ", city=" + city + "]";
	}
	

}
