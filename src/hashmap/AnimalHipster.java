package hashmap;

//Copyright Wintriss Technical Schools 2014

import static org.junit.Assert.*;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

public class AnimalHipster {
	@Test
	public void testAnimalHipster() {
		AnimalHipster animalHipster = new AnimalHipster();

		HashMap<String, ArrayList<String>> friendNetwork = new HashMap<String, ArrayList<String>>();
		HashMap<String, String> favoriteAnimals = new HashMap<String, String>();

		friendNetwork.put(
				"Amy",
				new ArrayList<String>(Arrays.asList(new String[] { "Brie",
						"Chris" })));
		friendNetwork.put(
				"Brie",
				new ArrayList<String>(Arrays.asList(new String[] { "Amy",
						"Chris", "Elena", "Devney" })));
		friendNetwork.put(
				"Chris",
				new ArrayList<String>(Arrays.asList(new String[] { "Amy",
						"Brie", "Elena", "Fan-Hal" })));
		friendNetwork.put(
				"Devney",
				new ArrayList<String>(Arrays.asList(new String[] { "Brie",
						"Elena" })));
		friendNetwork.put(
				"Elena",
				new ArrayList<String>(Arrays.asList(new String[] { "Brie",
						"Chris", "Devney", "Fan-Hal" })));
		friendNetwork.put(
				"Fan-Hal",
				new ArrayList<String>(Arrays.asList(new String[] { "Chris",
						"Elena" })));

		favoriteAnimals.put("Amy", "Quokka");
		favoriteAnimals.put("Devney", "Springbok");
		favoriteAnimals.put("Brie", "Springbok");
		favoriteAnimals.put("Chris", "Nubian Ibex");
		favoriteAnimals.put("Elena", "Quokka");
		favoriteAnimals.put("Fan-Hal", "Springbok");

		assertTrue(animalHipster.findAnimalHipsters(friendNetwork,
				favoriteAnimals).containsAll(
				new ArrayList<String>(Arrays.asList(new String[] { "Amy",
						"Elena", "Chris", "Fan-Hal" }))));
	}

	private AbstractCollection<String> findAnimalHipsters(
			HashMap<String, ArrayList<String>> friendNetwork,
			HashMap<String, String> favoriteAnimals) {
		ArrayList<String> hipstairers = new ArrayList<String>();
		hipstairers.addAll(favoriteAnimals.keySet());
		for (ArrayList<String> s : friendNetwork.values()) {
			System.out.println();
			String favAnimal = favoriteAnimals.get(friendNetwork.get(s));
			for (String f : s) {
				if (favAnimal == favoriteAnimals.get(f)) {
					System.out.println(friendNetwork.get(s)
							+ " is not an animal hipstarer because of "
							+ friendNetwork.get(f));
					hipstairers.remove(s);
				}
			}

		}
		return hipstairers;
	}

}
