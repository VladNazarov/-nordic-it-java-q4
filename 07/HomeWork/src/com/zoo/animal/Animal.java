package com.zoo.animal;

public class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
