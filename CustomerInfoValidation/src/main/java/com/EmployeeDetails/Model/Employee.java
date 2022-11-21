package com.EmployeeDetails.Model;  
import java.util.Date;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.Id;  
import javax.persistence.Table;

 
import org.springframework.format.annotation.DateTimeFormat;

import com.EmployeeDetails.validation.DOB;
import com.EmployeeDetails.validation.Email;  
import com.EmployeeDetails.validation.SSN;
import com.EmployeeDetails.validation.Mobile;
@Entity  
@Table (name="Employee")
public class Employee   
{  
	@Id  
	@Column  
	private int id;  

	@Column  
	private String name; 

	@DOB
	@Column
	private Date dob;
	
	@SSN
	@Column  
	private String SSN; 
	
	@Mobile
	@Column  
	private String mobile; 
	
	@Email
	@Column
	private String email;  
	public int getId()   
	{  
		return id;  
	}  
	public void setId(int id)   
	{  
		this.id = id;  
	}  
	public String getName()   
	{  
		return name;  
	}  
	public void setName(String name)   
	{  
		this.name = name;  
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getSSN() {
		return SSN;
	}
	public void setSSN(String sSN) {
		SSN = sSN;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}  

}  