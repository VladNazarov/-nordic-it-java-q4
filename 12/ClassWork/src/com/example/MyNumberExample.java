package com.example;

public class MyNumberExample {
	public static void main(String[] args) {
		var number = new MyNumber(6983572);

		for (var digit : number) {
			System.out.print(digit + " ");
		}

	}
}