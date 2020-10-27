package com.wars.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.wars.api.dao.IAnimalDao;
import com.wars.entities.Animal;
import com.wars.entities.Bear;
import com.wars.entities.Wolf;

public class AnimalDao implements IAnimalDao {

	private final List<Animal> animals = new ArrayList<>();

	@Override
	public List<Animal> getFighters() {
		Connection con = null;
		Statement stmt = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/wars?serverTimezone=UTC", "root",
					"narrenturm");
			try {
				stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM animal WHERE id = '1' ");
				if (rs.next()) {
					Wolf wolf1 = new Wolf();
					wolf1.setName(rs.getString("name"));
					wolf1.setStamina(rs.getInt("stamina"));
					wolf1.setStrength(rs.getInt("strength"));
					animals.add(wolf1);
				}
				rs = stmt.executeQuery("SELECT * FROM animal WHERE id = '2' ");
				if (rs.next()) {
					Wolf wolf2 = new Wolf();
					wolf2.setName(rs.getString("name"));
					wolf2.setStamina(rs.getInt("stamina"));
					wolf2.setStrength(rs.getInt("strength"));
					animals.add(wolf2);
				}
				rs = stmt.executeQuery("SELECT * FROM animal WHERE id = '3' ");
				if (rs.next()) {
					Bear bear1 = new Bear();
					bear1.setName(rs.getString("name"));
					bear1.setStamina(rs.getInt("stamina"));
					bear1.setStrength(rs.getInt("strength"));
					animals.add(bear1);
				}
				rs = stmt.executeQuery("SELECT * FROM animal WHERE id = '4' ");
				if (rs.next()) {
					Bear bear2 = new Bear();
					bear2.setName(rs.getString("name"));
					bear2.setStamina(rs.getInt("stamina"));
					bear2.setStrength(rs.getInt("strength"));
					animals.add(bear2);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return animals;
	}

	@Override
	public void addFighter(Animal animal) {

	}
}
