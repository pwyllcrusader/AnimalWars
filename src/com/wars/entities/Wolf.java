package com.wars.entities;

public class Wolf extends Animal{
	
	public Wolf(String name) {
		setName(name);
		setStrength(7 + (int) (Math.random() * 5));
		setStamina(10 + (int) (Math.random() * 10));
	}
}
