package by.wars.animals;

public abstract class Animal {

	private String name;
	private int strength;
	private int stamina;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}
	
	public void hit(Animal animal) {
		animal.setStamina(animal.getStamina() - this.getStrength());
		System.out.println(this.getName() + " ударил с силой " + this.getStrength() + ", у " + 
							animal.getName() + " осталось " + animal.getStamina() + " жизней" );
	}

}
