package com.model;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="regular")

public class RegEmployee extends Employee{
	float salary;
	String dept;
	
	
	public RegEmployee(float salary, String dept,String name) {
		super(name);
		this.salary = salary;
		this.dept = dept;
	}
	public float getSalary() {
		return salary;
	}
	public String getDept() {
		return dept;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	

}