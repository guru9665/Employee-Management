package com.example.Registration.EmployeeController;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Registration.Entitty.Employee;
import com.example.Registration.Service.EmployeeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping(path = "/save")
	public String saveEmployee(@RequestBody Employee employeeDTO) {
		String id =employeeService.addEmployee(employeeDTO);
		return id;
	}
	
	@PutMapping(path = "/update")
	public String updateEmployee(@RequestBody Employee employeeDTO) {
		String id =employeeService.addEmployee(employeeDTO);
		return id;
	}
	
	@GetMapping("/{id}")
	public Optional<Employee> findEmployeeById(@PathVariable("id") int id) {
		return employeeService.findEmployee(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteEmployee(@PathVariable("id") int id) {
		employeeService.deleteEmployee(id);
	}
	
	@GetMapping
	public List<Employee> findAllEmployee(){
		return employeeService.findAllEmployee();
	}
}
