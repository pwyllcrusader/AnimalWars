package by.wars;

import by.wars.animals.*;

public class GameStarter {

	public static void main(String[] args) {
		Bear medved = new Bear("������");
		Wolf volk = new Wolf("����");
		
		Arena arena = new Arena();
		arena.fight(medved, volk);
		
	}
}
