package com.societe.employee.api;

import java.util.Comparator;

import com.societe.employee.api.model.EmployeeRequest;

public class SortbyName implements Comparator<EmployeeRequest> {

	@Override
	public int compare(EmployeeRequest arg0, EmployeeRequest arg1) {
		// TODO Auto-generated method stub
        return arg0.firstName.compareTo(arg1.firstName); 
	}

}
