package com.capg.service;

import java.util.List;

import com.capg.beans.Address;
import com.capg.beans.Employee;
import com.capg.repo.EmployeeRepo;

public class EmployeeServiceImpl implements EmployeeService {
	int i=1;

	public EmployeeServiceImpl(EmployeeRepo emR) {
		super();
		this.emR = emR;
	}

	EmployeeRepo emR;
	Employee e;
	@Override
	public Employee createEmployee(String employee, Address add) {
		// TODO Auto-generated method stub
		 e=new Employee(employee,i, add);
        i=i+1;
		return emR.save(e);
	}

	@Override
	public List<Employee> searchByNmae(String name) {
		// TODO Auto-generated method stub
		List<Employee> list=emR.findByName(name);
		return list;
	}

}
