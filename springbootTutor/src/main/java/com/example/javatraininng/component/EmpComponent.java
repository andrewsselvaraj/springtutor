package com.example.javatraininng.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import com.example.javatraininng.bean.EmployeeBean;

@Component
public class EmpComponent {
	public EmployeeBean insertEmployee(EmployeeBean employeeBean)
	{
		return employeeBean;
	}
	
}
