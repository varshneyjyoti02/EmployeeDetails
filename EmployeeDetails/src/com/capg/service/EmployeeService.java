package com.capg.service;



import java.util.List;

import com.capg.beans.Address;
import com.capg.beans.Employee;

public interface EmployeeService {
	 Employee createEmployee(String employee,Address add);
	 List<Employee> searchByNmae(String name);

}
