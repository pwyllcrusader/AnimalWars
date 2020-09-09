package by.wars;

import by.wars.animals.Animal;

public class Arena {
	
	public void fight(Animal animal1, Animal animal2) {
		System.out.println("Сейчас воюют: " + animal1.getName() + " и " + animal2.getName());
		System.out.println(animal1.getName() + ": жизней - " + animal1.getStamina() + ", сила - " + animal1.getStrength() );
		System.out.println(animal2.getName() + ": жизней - " + animal2.getStamina() + ", сила - " + animal2.getStrength() );
		while (animal1.getStamina() > 0 || animal2.getStamina() > 0) {
			animal1.hit(animal2);
			if (animal2.getStamina() < 0) {
				System.out.println("Проиграл " + animal2.getName());
				break;
			}
			animal2.hit(animal1);
			if (animal1.getStamina() < 0) {
				System.out.println("Проиграл " + animal1.getName());
			}			
		}		 
	}
}
