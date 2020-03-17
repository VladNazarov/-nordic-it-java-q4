package com.zoo.animal;

public class Animal {
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

	public void say() {
		System.out.println("I`m animal");
	}

	public void sleep() {
		System.out.println("ZZZzzzzz.....");
	}

	public void eat() {
		System.out.println("I`m eating...");
	}

	public void afraid() {
		System.out.println("I`m afraid...");
	}

}
