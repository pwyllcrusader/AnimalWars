package com.wars.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class TournamentHelper {

	public static void saveFightResult(String result) {
		try (FileWriter fr = new FileWriter("results.txt", true)) {
			try (BufferedWriter writer = new BufferedWriter(fr)) {
				writer.write(result);
			}
		} catch (IOException e) {
			System.out.println("Something went wrong while writting results in file!");
		}
	}
}
