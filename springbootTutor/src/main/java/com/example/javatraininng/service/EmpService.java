package com.example.javatraininng.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import com.example.javatraininng.bean.EmployeeBean;
import com.example.javatraininng.component.EmpComponent;
import com.example.javatraininng.vo.EmployeeVO;

@Service
public class EmpService {
	@Autowired
	EmpComponent empComponent;
	public EmployeeVO insertEmployee(EmployeeVO employeeVO)
	{
		
		return populateVO(empComponent.insertEmployee(populateBean(employeeVO)));
		
	}
	
	EmployeeBean populateBean(EmployeeVO employeeVO)
	{
		EmployeeBean employeeBean= new EmployeeBean();
		employeeBean.setName(employeeVO.getName());
		return employeeBean;
		
	}
	
	EmployeeVO populateVO(EmployeeBean employeeBean)
	{
		EmployeeVO employeeVO= new EmployeeVO();
		employeeVO.setName(employeeBean.getName());
		return employeeVO;
		
	}
}
