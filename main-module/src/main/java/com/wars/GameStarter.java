package com.wars;

import com.wars.entities.Bear;
import com.wars.entities.Wolf;
import com.wars.service.AnimalService;
import com.wars.service.WarService;

public class GameStarter {

	public static void main(String[] args) {
		Bear medved1 = new Bear("Mishanja");
		Wolf volk1 = new Wolf("Vovan");
		Bear medved2 = new Bear("Michelle");
		Wolf volk2 = new Wolf("Valdis");
		
		AnimalService animalService = new AnimalService();
		animalService.addFighter(medved1);
		animalService.addFighter(volk1);
		animalService.addFighter(medved2);
		animalService.addFighter(volk2);
		
		WarService arena = new WarService();
		arena.beginTournament(animalService.getFighters());
	}
}