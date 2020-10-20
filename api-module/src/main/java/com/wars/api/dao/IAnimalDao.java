package com.wars.api.dao;

import java.util.List;

import com.wars.entities.Animal;

public interface IAnimalDao {

	void addFighter(Animal animal);

	List<Animal> getFighters();
}