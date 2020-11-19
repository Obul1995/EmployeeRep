package com.societe.employee.api.service;

import java.util.ArrayList;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.societe.employee.api.SortbyName;
import com.societe.employee.api.model.EmployeeRequest;
import com.societe.employee.api.model.MessageResponse;

@Service
public class EmployeeService {
	@Autowired
	private MessageResponse response;
	
	public static ArrayList<EmployeeRequest> employeeList = new ArrayList<EmployeeRequest>() {
		{
			
			add(new EmployeeRequest("obul","reddy","20-06-1995","Male","IT"));
			add(new EmployeeRequest("Raju","bhai","27-05-1885","Male","ADMIN"));
			add(new EmployeeRequest("rani","ruthu","29-02-1825","Female","Banking"));
			add(new EmployeeRequest("pallavi","kumari","22-01-2007","Female","Security"));

		}
	};
	
   
 public MessageResponse createEmployee(EmployeeRequest req) {
	 EmployeeService.employeeList.add(req);
	 return response.successMessage("success");
 }
 
 public ArrayList<EmployeeRequest> getEmployee() {
	Collections.sort(EmployeeService.employeeList,new SortbyName());
	 return  EmployeeService.employeeList;
 }
 
}
