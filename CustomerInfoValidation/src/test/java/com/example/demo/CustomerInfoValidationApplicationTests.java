package com.EmployeeDetails;

import com.EmployeeDetails.Model.Employee;
import com.EmployeeDetails.Repository.EmployeeRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Iterator;

@SpringBootTest
class CustomerInfoValidationApplicationTests {

	@Autowired
	EmployeeRepository employeeController;


	@Test
	public void testGetAllEmployees() {


		Iterable<Employee> emp1 = employeeController.findAll();
		Iterator<Employee> newEmpList = emp1.iterator();
		while (newEmpList.hasNext()) {

			Employee empTest = newEmpList.next();
			System.out.println(empTest);
			Assert.isTrue(empTest.getId() != -1);
		}
	}


	@Test
	public void testSaveEmployee()
	{
		Employee employee=new Employee();
		employee.setEmail("abc.gmail.com");
		employee.setId(100);
		employee.setName("Test");

		employeeController.save(employee);

	}

}
