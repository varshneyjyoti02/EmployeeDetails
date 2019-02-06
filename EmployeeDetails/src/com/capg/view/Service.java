package com.capg.view;

import java.util.List;

import com.capg.beans.Address;
import com.capg.beans.City;
import com.capg.beans.Country;
import com.capg.beans.Employee;
import com.capg.repo.EmployeeRepo;
import com.capg.repo.EmployeeRepoImpl;
import com.capg.service.EmployeeService;
import com.capg.service.EmployeeServiceImpl;

public class Service {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		City ci=new City("Delhi");
		Country co=new Country("India",ci);
		Address ad=new Address("Talwade",co);
		
		EmployeeRepo er=new EmployeeRepoImpl();
		EmployeeService es=new EmployeeServiceImpl(er);
	
		Address ad1=new Address("Hinjwadi",new Country("India",new City("Pune")));
		Address ad2=new Address("Nigdi",new Country("India",new City("Mumbai")));
		Address ad3=new Address("Pimpri",new Country("India",new City("Goa")));
		Address ad4=new Address("Chinchwad",new Country("India",new City("Noida")));
		es.createEmployee("Jyoti",ad);
		es.createEmployee("Raj",ad1);
		es.createEmployee("Hemant",ad2);
		es.createEmployee("Neha",ad3);
		es.createEmployee("Prashant",ad4);
		
		List<Employee> list=es.searchByNmae("Raj");
		for(Employee e:list)
		System.out.println(e);

		
		
	}

}
