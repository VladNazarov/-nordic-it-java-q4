package com.zoo.animal;

import com.zoo.exception.NegativeValueException;

public class Duck extends Animal {

	public Duck() {
		super();
	}

	public Duck(String name, int age) {
		super(name, age);
	}

	@Override
	public void say() {
		System.out.println("Quack quack");
	}

	@Override
	public void afraid() {
		System.out.println("I`m afraid of fox");
	}

	public void fly(int meters) throws NegativeValueException {
		if (meters < 0) {
			throw new NegativeValueException("Can`t be negative meters");
		}
		System.out.println("I flew " + meters + " meters");
	}

}
