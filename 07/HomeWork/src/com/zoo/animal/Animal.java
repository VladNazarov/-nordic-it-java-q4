package com.zoo.animal;

import com.zoo.action.AbleToEat;
import com.zoo.action.Afraidable;
import com.zoo.action.Sayable;
import com.zoo.action.Sleepable;
import com.zoo.exception.NegativeValueException;
import com.zoo.exception.TooManyHoursException;

public abstract class Animal implements Sleepable, AbleToEat, Sayable, Afraidable {
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

	public void sleep(byte hours) throws NegativeValueException, TooManyHoursException {
		if (hours < 0) {
			throw new NegativeValueException("Hours can`t be negative");
		} else if (hours > 12) {
			throw new TooManyHoursException("Too many hours");
		}
		System.out.println("ZZZZZzzzzz..." + hours + " hours");
	}

	public void eat() {
		System.out.println("I`m eating...");
	}

}
