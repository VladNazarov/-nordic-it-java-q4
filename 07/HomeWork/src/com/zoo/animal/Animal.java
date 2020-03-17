package com.zoo.animal;

public abstract class Animal implements Sleepable {
	private String name;
	private int age;

	public Animal() {

	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public abstract void say();

	public abstract void afraid();

	public void sleep() {
		System.out.println("ZZZzzzzz.....");
	}

	public void eat() {
		System.out.println("I`m eating...");
	}

}
