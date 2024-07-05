package com.model;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value="trainee")

public class Trainee extends Employee{
	float payperhour;
	String contractperiod;
	
	
	public Trainee(String name, float payperhour, String contractperiod) {
		super(name);
		this.payperhour = payperhour;
		this.contractperiod = contractperiod;
	}
	public float getPayperhour() {
		return payperhour;
	}
	public String getContractperiod() {
		return contractperiod;
	}
	public void setPayperhour(float payperhour) {
		this.payperhour = payperhour;
	}
	public void setContractperiod(String contractperiod) {
		this.contractperiod = contractperiod;
	}
	

}