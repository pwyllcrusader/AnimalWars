package com.wars.api.service;

import java.util.List;

import com.wars.entities.Animal;

public interface IAnimalService {

	void addFighter(Animal animal);

	List<Animal> getFighters();
}
