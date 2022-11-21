package com.EmployeeDetails;

import com.EmployeeDetails.Controller.EmployeeController;
import com.EmployeeDetails.Model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest

public class EmployeeControllerTest {

    @Autowired
    EmployeeController employeeController;


    @Test
    public void testGetSaveEmployees() {

        Employee employee=new Employee();
        employee.setEmail("abc.gmail.com");
        employee.setId(100);
        employee.setName("Test");


        employeeController.saveStudent(employee);

    }


   @Test
        public void testSaveEmployee() throws  Exception
        {
           employeeController.getEmployee(1);

        }








}
