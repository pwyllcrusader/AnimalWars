package com.wars;

import com.wars.service.AnimalService;
import com.wars.service.WarService;

public class GameStarter {

	public static void main(String[] args) {

		AnimalService animalService = new AnimalService();

		WarService arena = new WarService();
		arena.beginTournament(animalService.getFighters());
	}
}