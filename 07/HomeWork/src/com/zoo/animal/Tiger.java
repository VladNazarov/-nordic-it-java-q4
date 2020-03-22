package com.zoo.animal;

public class Tiger extends Animal {

	public Tiger() {
		super();
	}

	public Tiger(String name, int age) {
		super(name, age);
	}

	public void say() {
		System.out.println("RRRRRR....");
	}

	public void afraid() {
		System.out.println("I`m afraid of hunters");
	}

	public void hunt() {
		System.out.println("I`m hunting for animals");
	}

}
