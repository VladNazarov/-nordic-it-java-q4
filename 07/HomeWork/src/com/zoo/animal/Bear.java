package com.zoo.animal;

public class Bear extends Animal {

	public Bear() {
		super();

	}

	public Bear(String name, int age) {
		super(name, age);

	}

	public void say() {
		System.out.println("AAARRRRR");
	}

	public void afraid() {
		System.out.println("I`m afraid of bees");
	}

	public void fishing() {
		System.out.println("I`m fishing");
	}

}
