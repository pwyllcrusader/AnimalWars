package com.wars.dao;

import java.util.ArrayList;
import java.util.List;

import com.wars.api.dao.IAnimalDao;
import com.wars.entities.Animal;


public class AnimalDao implements IAnimalDao{
	
	private final List<Animal> animals = new ArrayList<>();

	@Override
	public void addFighter(Animal animal) {
		animals.add(animal);
	}

	@Override
	public List<Animal> getFighters() {
		return animals;
	}
}
