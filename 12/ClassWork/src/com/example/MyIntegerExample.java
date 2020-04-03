package com.example;

public class MyIntegerExample {
	public static void main(String[] args) {
		var number1 = new MyInteger(6983572);
		var number2 = new MyInteger(5234);
		var number3 = new MyInteger(8756);
		var number4 = new MyInteger(1234);

		for (var digit : number1) {
			System.out.print(digit + " ");
		}
		System.out.println();

		for (var digit : number2) {
			System.out.print(digit + " ");
		}
		System.out.println();

		for (var digit : number3) {
			System.out.print(digit + " ");
		}
		System.out.println();

		for (var digit : number4) {
			System.out.print(digit + " ");
		}
		System.out.println();

	}
}