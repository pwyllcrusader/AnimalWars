package com.wars.api.service;

import com.wars.entities.Animal;

public interface IWarService {
	
	void hit(Animal animal1, Animal animal2);

	void fight(Animal animal1, Animal animal2);

}
