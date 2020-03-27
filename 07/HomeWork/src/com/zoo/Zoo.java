package com.zoo;

import java.util.HashMap;
import java.util.HashSet;

import com.zoo.animal.Animal;
import com.zoo.animal.Cat;
import com.zoo.animal.Duck;
import com.zoo.animal.Elephant;
import com.zoo.exception.AviaryDoesNotExistException;
import com.zoo.exception.NegativeValueException;
import com.zoo.exception.TheSameAnimalException;
import com.zoo.exception.TooManyAnimalsException;
import com.zoo.exception.TooManyHoursException;

public class Zoo {

	public static void main(String[] args) {
		var elephant = new Elephant();
		var duck = new Duck();
		var cat1 = new Cat("Name1", 1);
		var cat2 = new Cat("Name2", 1);
		var cat3 = new Cat("Name3", 1);
		var cat4 = new Cat("Name4", 1);
		var cat5 = new Cat("Name5", 1);

		var aviary = new HashSet<Animal>();

		try {
			addAnimal(duck, aviary);
			addAnimal(cat1, aviary);
			addAnimal(cat2, aviary);
			addAnimal(cat3, aviary);
			addAnimal(cat4, aviary);
			addAnimal(cat5, aviary);

		} catch (TooManyAnimalsException | TheSameAnimalException e) {
			System.out.println(e.getMessage());
		}

		deleteAnimal(duck, aviary);

		try {
			elephant.sleep((byte) -4);

		} catch (NegativeValueException | TooManyHoursException e) {
			System.out.println(e.getMessage());
		}

		try {
			duck.fly(5);

		} catch (NegativeValueException e) {
			System.out.println(e.getMessage());
		}

		try {
			cat1.play((byte) 2);

		} catch (TooManyHoursException e) {
			System.out.println(e.getMessage());
		}

		var aviaries = new HashMap<String, HashSet<Animal>>();
		var aviary1 = new HashSet<Animal>();
		var aviary2 = new HashSet<Animal>();
		var aviary3 = new HashSet<Animal>();
		var aviary4 = new HashSet<Animal>();

		aviaries.put("Cats", aviary1);
		aviaries.put("Dogs", aviary2);
		aviaries.put("Ducks", aviary3);
		aviaries.put("Snakes", aviary4);

		try {
			addAnimal(cat1, "Cats", aviaries);

		} catch (TooManyAnimalsException | TheSameAnimalException | AviaryDoesNotExistException e) {
			System.out.println(e.getMessage());
		}

		try {
			addAnimal(cat1, "Elephants", aviaries);

		} catch (TooManyAnimalsException | TheSameAnimalException | AviaryDoesNotExistException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void addAnimal(Animal animal, String nameAviary, HashMap<String, HashSet<Animal>> aviaries)
			throws TooManyAnimalsException, TheSameAnimalException, AviaryDoesNotExistException {

		var aviary = aviaries.get(nameAviary);

		if (aviary == null) {
			throw new AviaryDoesNotExistException("Aviary does not exist");

		} else {

			if (aviary.contains(animal)) {
				throw new TheSameAnimalException("Can`t be added the same animal");

			} else if (aviary.size() > 4) {
				throw new TooManyAnimalsException("Too many animals in aviary");

			} else {
				aviary.add(animal);
			}
		}
	}

	public static void addAnimal(Animal animal, HashSet<Animal> aviary)
			throws TooManyAnimalsException, TheSameAnimalException {

		if (aviary.contains(animal)) {
			throw new TheSameAnimalException("Can`t be added the same animal");

		} else if (aviary.size() > 4) {
			throw new TooManyAnimalsException("Too many animals in aviary");

		} else {
			aviary.add(animal);
		}
	}

	public static void deleteAnimal(Animal animal, HashSet<Animal> aviary) {
		aviary.remove(animal);
	}

	public static void deleteAnimal(Animal animal, String aviary, HashMap<String, HashSet<Animal>> aviaries) {
		aviaries.get(aviary).remove(animal);
	}

}
