/**
 * 
 */
package com.star.sud.SpringBootJSPCrudOperation.employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.star.sud.SpringBootJSPCrudOperation.employee.model.TEmployee;

/**
 * @author Sudarshan
 *
 */
public interface EmployeeRepository extends JpaRepository<TEmployee, String> {

}
