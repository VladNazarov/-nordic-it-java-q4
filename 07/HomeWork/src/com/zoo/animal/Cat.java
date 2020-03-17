package com.zoo.animal;

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

	public void play() {
		System.out.println("I`m playing with ball");
	}

}
