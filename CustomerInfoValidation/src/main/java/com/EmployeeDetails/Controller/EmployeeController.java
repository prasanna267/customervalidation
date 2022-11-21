package com.EmployeeDetails.Controller;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.DeleteMapping;  
import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.PostMapping;  
import org.springframework.web.bind.annotation.RequestBody;  
import org.springframework.web.bind.annotation.RestController;

import com.EmployeeDetails.Model.Employee;
import com.EmployeeDetails.Service.EmployeeService;  
//creating RestController  
@RestController  
public class EmployeeController   
{  
@Autowired  
EmployeeService employeeService;  
@GetMapping("/employee")  
private List<Employee> getAllEmployee()   
{  
return employeeService.getAllEmployee();  
}  
@GetMapping("/employee/{id}")  
private Employee getEmployee(@PathVariable("id") int id)   
{  
return employeeService.getEmployeeById(id);  
}  
@DeleteMapping("/employee/{id}")  
private void deleteEmployee(@PathVariable("id") int id)   
{  
	employeeService.delete(id);  
}  
@PostMapping("/employee")  
private int saveStudent(@RequestBody Employee employee)   
{  
	Employee emp= employeeService.saveOrUpdate(employee);  
	return emp.getId();  
}  
}  