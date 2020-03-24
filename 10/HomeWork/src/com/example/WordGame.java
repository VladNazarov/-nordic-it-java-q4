package com.example;

import java.util.HashSet;
import java.util.Scanner;

public class WordGame {

	public static void main(String[] args) {
		HashSet<Character> letters = new HashSet<>();
		HashSet<String> wordsHistory = new HashSet<>();

		var scanner = new Scanner(System.in);

		System.out.println("Введите слово: ");
		var word = scanner.nextLine();

		for (int i = 0; i < word.length(); i++) {
			letters.add(word.charAt(i));
		}

		var isEndFirst = false;
		var isEndSecond = false;

		do {
			isEndFirst = false;
			isEndSecond = false;

			System.out.println("Ход первого игрока: ");
			var stepFirst = scanner.nextLine();

			if (stepFirst.isEmpty()) {
				isEndFirst = true;

			} else {
				var isWrongLetter = false;

				for (int i = 0; i < stepFirst.length(); i++) {

					if (!letters.contains(stepFirst.charAt(i))) {
						System.out.println("Таких букв нет в слове!");
						isWrongLetter = true;
						break;
					}
				}
				if (!wordsHistory.contains(stepFirst) && !isWrongLetter) {
					wordsHistory.add(stepFirst);

				} else if (wordsHistory.contains(stepFirst)) {
					System.out.println("Такое слово уже было");
				}

			}

			System.out.println("Ход второго игрока: ");
			var stepSecond = scanner.nextLine();

			if (stepSecond.isEmpty()) {
				isEndSecond = true;

			} else {
				var isWrongLetter = false;

				for (int i = 0; i < stepSecond.length(); i++) {

					if (!letters.contains(stepSecond.charAt(i))) {
						System.out.println("Таких букв нет в слове!");
						isWrongLetter = true;
						break;
					}
				}
				if (!wordsHistory.contains(stepSecond) && !isWrongLetter) {
					wordsHistory.add(stepSecond);

				} else if (wordsHistory.contains(stepSecond)) {
					System.out.println("Такое слово уже было");
				}

			}

		} while (!isEndFirst || !isEndSecond);

		System.out.println("Игра окончена!");

		for (var s : wordsHistory) {
			System.out.println(s);
		}
	}
}
