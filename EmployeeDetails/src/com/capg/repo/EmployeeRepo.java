package com.capg.repo;

import java.util.List;

import com.capg.beans.Employee;

public interface EmployeeRepo {
	Employee save(Employee e);
	List<Employee> findByName(String name);
	

}
