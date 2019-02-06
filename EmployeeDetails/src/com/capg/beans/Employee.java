package com.capg.beans;

public class Employee {
	private String eName;
	private int id;
	private Address address;
	@Override
	public String toString() {
		return "Employee [eName=" + eName + ", id=" + id + ", address=" + address + "]";
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Employee(String eName, int i, Address address) {
		super();
		this.eName = eName;
		this.id = i;
		this.address = address;
	}

}
