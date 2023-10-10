package com.example.Registration.Service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Registration.Entitty.Employee;
import com.example.Registration.Repo.EmployeeRepo;

@Service
 class EmployeeImpl implements EmployeeService{

	@Autowired
	private EmployeeRepo employeeRepo;
	
	@Override
	public String addEmployee(Employee employeeDTO) {
		// TODO Auto-generated method stub
		Employee employee=new Employee(
				employeeDTO.getEmployeeid(),
				employeeDTO.getEmployeename(),
				employeeDTO.getAddress(),
				employeeDTO.getMobile()
				);
		employeeRepo.save(employee);
		return employee.getEmployeename();
	}

	@Override
	public Optional<Employee> findEmployee(int id) {
		// TODO Auto-generated method stub
		return employeeRepo.findById(id);
	}

	@Override
	public String updateEmployee(Employee employeeDTO) {
		// TODO Auto-generated method stub
		Employee employee=new Employee(
				employeeDTO.getEmployeeid(),
				employeeDTO.getEmployeename(),
				employeeDTO.getAddress(),
				employeeDTO.getMobile()
				);
		employeeRepo.save(employee);
		return employee.getEmployeename();
	}

	@Override
	public void deleteEmployee(int id) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(id);;
		
	}

	@Override
	public List<Employee> findAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepo.findAll();
	}

}
