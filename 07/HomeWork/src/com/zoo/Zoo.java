package com.zoo;

import com.zoo.animal.Cat;
import com.zoo.animal.Duck;
import com.zoo.animal.Elephant;
import com.zoo.exception.NegativeValueException;
import com.zoo.exception.TooManyHoursException;

public class Zoo {

	public static void main(String[] args) {
		var elephant = new Elephant();
		var duck = new Duck();
		var cat = new Cat();

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
			cat.play((byte) 2);

		} catch (TooManyHoursException e) {
			System.out.println(e.getMessage());
		}

	}

}
