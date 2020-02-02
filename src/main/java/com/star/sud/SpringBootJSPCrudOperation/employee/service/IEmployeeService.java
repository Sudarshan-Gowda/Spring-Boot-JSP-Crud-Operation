package com.star.sud.SpringBootJSPCrudOperation.employee.service;

import java.util.List;

import com.star.sud.SpringBootJSPCrudOperation.employee.dto.EmployeeDetails;
import com.star.sud.SpringBootJSPCrudOperation.status.AppServiceStatus;

public interface IEmployeeService {

	AppServiceStatus addEmployee(EmployeeDetails dto);

	/**
	 * @return
	 */
	List<EmployeeDetails> getAllEmployees();

	/**
	 * @param radio
	 * @return
	 */
	EmployeeDetails modifyEmployee(String radio);

	/**
	 * @param dto
	 * @return
	 */
	AppServiceStatus updateEmployee(EmployeeDetails dto);

	/**
	 * @param radio
	 * @return
	 */
	AppServiceStatus deleteEmployee(String radio);

	/**
	 * @param radio
	 * @return
	 */
	EmployeeDetails viewEmployee(String radio);

}
