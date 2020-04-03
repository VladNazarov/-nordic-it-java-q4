package com.example;

import java.util.ArrayList;
import java.util.Collections;

public class MyIntegerExample {
	public static void main(String[] args) {
		var array = new ArrayList<MyInteger>();

		array.add(new MyInteger(12));
		array.add(new MyInteger(210));
		array.add(new MyInteger(30));
		array.add(new MyInteger(2730));
		array.add(new MyInteger(31));

		Collections.sort(array);

		for (var myInt : array) {
			System.out.println(myInt);
		}

	}
}
