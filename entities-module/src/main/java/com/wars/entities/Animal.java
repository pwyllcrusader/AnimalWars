package com.wars.entities;

import java.io.Serializable;

public abstract class Animal implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private int strength;
	private int stamina;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
}
