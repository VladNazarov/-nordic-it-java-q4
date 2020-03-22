package com.zoo.animal;

import com.zoo.exception.TooManyHoursException;

public class Cat extends Animal {

	public Cat() {
		super();
	}

	public Cat(String name, int age) {
		super(name, age);
	}

	public void say() {
		System.out.println("Meow");
	}

	public void afraid() {
		System.out.println("I`m afraid of dogs");
	}

	public void play(byte hours) throws TooManyHoursException {
		if (hours > 3) {
			throw new TooManyHoursException("Too many hours");
		}

		System.out.println("I`m playing with ball for " + hours + " hours");
	}

}
