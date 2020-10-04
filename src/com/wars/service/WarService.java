package com.wars.service;

import com.wars.entities.Animal;

public class WarService {
	
	
	public void hit(Animal animal1, Animal animal2) {
		animal2.setStamina(animal2.getStamina() - animal1.getStrength());
		System.out.println(animal1.getName() + " hits with strength " + animal1.getStrength() + ", " + 
							animal2.getName() + " has " + animal2.getStamina() + " healthpoints" );
	}
	
	public void fight(Animal animal1, Animal animal2) {
		System.out.println("Now fighting: " + animal1.getName() + " versus " + animal2.getName());
		System.out.println("    " + animal1.getName() + ": stamina - " + animal1.getStamina() + ", strenghth - " + animal1.getStrength() );
		System.out.println("    " + animal2.getName() + ": stamina - " + animal2.getStamina() + ", strenghth - " + animal2.getStrength() );
		while (animal1.getStamina() > 0 && animal2.getStamina() > 0) {
			hit(animal1, animal2);
			if (animal2.getStamina() <= 0) {
				System.out.println(animal1.getName() + " wins!");
				break;
			}
			hit(animal2, animal1);
			if (animal1.getStamina() < 0) {
				System.out.println(animal2.getName() + " wins");
				break;
			}			
		}		 
	}
	
}