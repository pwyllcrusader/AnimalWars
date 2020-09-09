package by.wars.animals;

public class Wolf extends Animal{
	
	public Wolf(String name) {
		setName(name);
		setStrength(5 + (int) Math.random() * 5 );
		setStamina(10 + (int) Math.random() * 10);
	}
}
