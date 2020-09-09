package by.wars;

import by.wars.animals.Animal;

public class Arena {
	
	public void fight(Animal animal1, Animal animal2) {
		System.out.println("������ �����: " + animal1.getName() + " � " + animal2.getName());
		System.out.println(animal1.getName() + ": ������ - " + animal1.getStamina() + ", ���� - " + animal1.getStrength() );
		System.out.println(animal2.getName() + ": ������ - " + animal2.getStamina() + ", ���� - " + animal2.getStrength() );
		while (animal1.getStamina() > 0 || animal2.getStamina() > 0) {
			animal1.hit(animal2);
			if (animal2.getStamina() < 0) {
				System.out.println("�������� " + animal2.getName());
				break;
			}
			animal2.hit(animal1);
			if (animal1.getStamina() < 0) {
				System.out.println("�������� " + animal1.getName());
			}			
		}		 
	}
}
