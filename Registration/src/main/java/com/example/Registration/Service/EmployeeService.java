package com.example.Registration.Service;

import java.util.List;
import java.util.Optional;

import com.example.Registration.Entitty.Employee;

public interface EmployeeService {
	List<Employee> findAllEmployee();
	String addEmployee(Employee employeeDTO);
	Optional<Employee> findEmployee(int id);
	String updateEmployee(Employee employeeDTO);
	void deleteEmployee(int id);
}
