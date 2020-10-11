package com.wars.service;

import java.util.List;

import com.wars.entities.Animal;
import com.wars.utils.TournamentHelper;

public class WarService {

	private void hit(Animal animal1, Animal animal2) {
		animal2.setStamina(animal2.getStamina() - animal1.getStrength());
		System.out.println(animal1.getName() + " hits with strength " + animal1.getStrength() + ", " + animal2.getName()
				+ " has " + animal2.getStamina() + " healthpoints");
	}

	private Animal fight(Animal animal1, Animal animal2) {
		System.out.println("Now fighting: " + animal1.getName() + " versus " + animal2.getName());
		System.out.println("    " + animal1.getName() + ": stamina - " + animal1.getStamina() + ", strenghth - "
				+ animal1.getStrength());
		System.out.println("    " + animal2.getName() + ": stamina - " + animal2.getStamina() + ", strenghth - "
				+ animal2.getStrength());
		Animal winner = null;
		TournamentHelper.serialize(animal1);
		TournamentHelper.serialize(animal2);
		while (animal1.getStamina() > 0 && animal2.getStamina() > 0) {
			hit(animal1, animal2);
			if (animal2.getStamina() <= 0) {
				System.out.println(animal1.getName() + " wins!");
				winner = animal1;
				animal1 = TournamentHelper.deserialize(animal1.toString());
				break;
			}
			hit(animal2, animal1);
			if (animal1.getStamina() < 0) {
				System.out.println(animal2.getName() + " wins");
				winner = animal2;
				animal2 = TournamentHelper.deserialize(animal2.toString());
				break;
			}
		}
		return winner;
	}

	public void beginTournament(List<Animal> fighters) {
		Animal semifinalist1 = fight(fighters.get(0), fighters.get(1));
		TournamentHelper.saveFightResult("First fight: " + fighters.get(0).getName() + " versus "
				+ fighters.get(1).getName() + "\n" + "The first semifinalist is " + semifinalist1.getName() + "!\n");
		Animal semifinalist2 = fight(fighters.get(2), fighters.get(3));
		TournamentHelper.saveFightResult("Second fight: " + fighters.get(2).getName() + " versus "
				+ fighters.get(3).getName() + "\n" + "The second semifinalist is " + semifinalist2.getName() + "!\n");
		Animal champion = fight(semifinalist1, semifinalist2);
		TournamentHelper.saveFightResult("Final fight: " + fighters.get(2).getName() + " versus "
				+ fighters.get(3).getName() + "\n" + "The champion is " + champion.getName() + "!\n");
	}
}