package com.csa.samplefullstack.entity;

import javax.persistence.*;

@Entity
@Table(name="tbl_employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employeeId;
	private String name;
	private String department;
	private String location;

	public Employee (int employeeId, String name, String department, String location){
		this.employeeId = employeeId;
		this.name = name;
		this.department = department;
		this.location = location;
	}
	public Employee(){

	}
	public void setEmployeeId(int employeeId){
		this.employeeId = employeeId;
	}
	public void setName(String name){
		this.name = name;
	}
	public void setDepartment(String department){
		this.department = department;
	}
	public void setLocation(String location){
		this.location = location;
	}
	public int getEmployeeId() {
		return this.employeeId;
	}
	public String getName() {
		return this.name;
	}
	public String getDepartment() {
		return this.department;
	}
	public String getLocation() {
		return this.location;
	}
}