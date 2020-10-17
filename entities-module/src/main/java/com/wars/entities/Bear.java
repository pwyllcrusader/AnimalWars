package com.wars.entities;

public class Bear extends Animal{
	
	private static final long serialVersionUID = 8202034059452174498L;

	public Bear(String name) {
		setName(name);
		setStrength(7 + (int) (Math.random() * 7 ));
		setStamina(12 + (int) (Math.random() * 12));
	}
}
