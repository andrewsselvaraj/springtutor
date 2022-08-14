package com.example.javatraininng.controller;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.javatraininng.service.EmpService;
import com.example.javatraininng.vo.EmployeeVO;

@RestController
public class EmpController {
	@Autowired
	EmpService empService;
	@PostMapping(
	        value = "/postbody",
	        consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
	        produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
	    public ResponseEntity<EmployeeVO> postBody(@RequestBody EmployeeVO employeeVO) {
		EmployeeVO employee = empService.insertEmployee(employeeVO);
	        return ResponseEntity
	            .created(URI
	                     .create(String.format("/persons/%s", employee.getName())))
	            .body(employeeVO);
	    }

}
