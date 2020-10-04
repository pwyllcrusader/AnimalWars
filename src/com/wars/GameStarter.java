package com.wars;

import com.wars.entities.Bear;
import com.wars.entities.Wolf;
import com.wars.service.WarService;

public class GameStarter {

	public static void main(String[] args) {
		Bear medved = new Bear("Mishanja");
		Wolf volk = new Wolf("Vovan");
		
		WarService arena = new WarService();
		arena.fight(medved, volk);
	}
}