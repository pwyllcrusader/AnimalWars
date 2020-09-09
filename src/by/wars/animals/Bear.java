package by.wars.animals;

public class Bear extends Animal{
	
	public Bear(String name) {
		setName(name);
		setStrength(7 + (int) (Math.random() * 7 ));
		setStamina(12 + (int) (Math.random() * 12));
	}
}
