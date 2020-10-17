package com.wars.service;

import java.util.List;

import com.wars.api.dao.IAnimalDao;
import com.wars.api.service.IAnimalService;
import com.wars.dao.AnimalDao;
import com.wars.entities.Animal;

public class AnimalService implements IAnimalDao, IAnimalService {

	private final AnimalDao animalDao = new AnimalDao();

	@Override
	public void addFighter(Animal animal) {
		animalDao.addFighter(animal);
	}

	@Override
	public List<Animal> getFighters() {
		return animalDao.getFighters();
	}
}
