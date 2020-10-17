package com.wars.utils;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.wars.entities.Animal;

public class TournamentHelper {

	private TournamentHelper() {
	}

	public static void saveFightResult(String result) {
		try (FileWriter fr = new FileWriter("results.txt", true); BufferedWriter writer = new BufferedWriter(fr)) {
			writer.write(result);
		} catch (IOException e) {
			System.out.println("Something went wrong while writting results in file!");
			e.printStackTrace();
		}
	}

	public static void serialize(Object obj) {
		try (FileOutputStream fileOutputStream = new FileOutputStream(
				"d:\\cdngz\\AnimalWars\\data\\" + obj.toString() + ".info");
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
			objectOutputStream.writeObject(obj);
		} catch (IOException e) {
			System.out.println("Something went wrong while saving data in file!");
			e.printStackTrace();
		}
	}

	public static Animal deserialize(String objName) {
		try (FileInputStream fileInputStream = new FileInputStream("d:\\cdngz\\AnimalWars\\data\\" + objName + ".info");
				ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
			return (Animal) objectInputStream.readObject();
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Something went wrong while restoring data from file!");
			e.printStackTrace();
			return null;
		}
	}
}
