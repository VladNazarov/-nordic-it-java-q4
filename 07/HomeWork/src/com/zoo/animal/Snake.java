package com.zoo.animal;

public class Snake extends Animal {

	public Snake() {
		super();
	}

	public Snake(String name, int age) {
		super(name, age);
	}

	@Override
	public void say() {
		System.out.println("SH-h-h-h");

	}

	@Override
	public void afraid() {
		System.out.println("I`m afraid of sun");

	}

	public void bite(Animal animal) {
		System.out.println("I`m biting " + animal.getName());
	}

}
