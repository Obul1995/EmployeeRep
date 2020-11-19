package com.societe.employee.api.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.societe.employee.api.model.EmployeeRequest;
import com.societe.employee.api.model.MessageResponse;
import com.societe.employee.api.service.EmployeeService;
@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService service;
	
	@Autowired
	private MessageResponse response;
	
	@PostMapping("/api/createEmployee")
	public ResponseEntity<MessageResponse> createEmployee(@RequestBody EmployeeRequest employee){
	    response = service.createEmployee(employee);
		return new ResponseEntity<>(response,HttpStatus.OK);
	}
	
	@GetMapping("/api/getEmployee")
	public ResponseEntity<ArrayList<EmployeeRequest>> getEmployee(){
		ArrayList<EmployeeRequest> res = service.getEmployee();
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
}
