package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class BMI_Cal {
    
	@Id
	private float BMI;
	
	private float Weight;
	
	private float Height;
	
	public float getBMI() {
		return BMI;
	}
	public void setBMI(float bMI) {
		BMI = bMI;
	}
	public float getWeight() {
		return Weight;
	}
	public void setWeight(float weight) {
		Weight = weight;
	}
	public float getHeight() {
		return Height;
	}
	public void setHeight(float height) {
		Height = height;
	}
	
}
