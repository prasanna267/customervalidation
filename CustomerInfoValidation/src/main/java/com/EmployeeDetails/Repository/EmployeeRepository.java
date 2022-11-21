package com.EmployeeDetails.Repository;  
import org.springframework.data.repository.CrudRepository;

import com.EmployeeDetails.Model.Employee;  
public interface EmployeeRepository extends CrudRepository<Employee, Integer>  
{  
}