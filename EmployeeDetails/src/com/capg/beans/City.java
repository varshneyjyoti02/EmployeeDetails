package com.capg.beans;

public class City {
	private String name;

	@Override
	public String toString() {
		return "City [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public City(String name) {
		super();
		this.name = name;
	}

}
