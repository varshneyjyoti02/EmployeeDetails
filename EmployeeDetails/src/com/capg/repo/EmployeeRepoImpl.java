package com.capg.repo;


import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;

import com.capg.beans.Employee;

public class EmployeeRepoImpl implements EmployeeRepo {

	HashMap<Integer,Employee> hm=new HashMap<>();
	@Override
	public Employee save(Employee e) {
		// TODO Auto-generated method stub
		hm.put(e.getId(), e);
		return e;
	}

	@Override
	public List<Employee> findByName(String name) {
		// TODO Auto-generated method stub
		List<Employee> employeeList=new LinkedList<Employee>();
		for(Entry<Integer,Employee> entry:hm.entrySet())
		{
			if(entry.getValue().geteName().equals(name))
			{
				employeeList.add(entry.getValue());
			}
		}
		return employeeList;
	}
	
	
	}

