package com.EmployeeDetails.Service;  
import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;

import com.EmployeeDetails.Model.Employee;
import com.EmployeeDetails.Repository.EmployeeRepository;  
@Service  
public class EmployeeService   
{  
@Autowired  
EmployeeRepository employeeRepository;  
public List<Employee> getAllEmployee()   
{  
List<Employee> students = new ArrayList<Employee>();  
employeeRepository.findAll().forEach(employee -> ((List<Employee>) employee).add(employee));  
return students;  
}  
public Employee getEmployeeById(int id)   
{  
return employeeRepository.findById(id).get();  
}  
public Employee saveOrUpdate(Employee employee)   
{  
	return employeeRepository.save(employee);  
}  
public void delete(int id)   
{  
	employeeRepository.deleteById(id);  
}  
}  