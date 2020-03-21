package com.example;

import java.util.HashSet;
import java.util.Scanner;

public class WordGame {

	public static void main(String[] args) {
		var scanner = new Scanner(System.in);

		System.out.println("Введите слово: ");
		var word = scanner.nextLine();

		var letters = new HashSet<Character>();
		var wordsHistory = new HashSet<String>();

		for (int i = 0; i < word.length(); i++) {
			letters.add(word.charAt(i));
		}

		var isEndFirst = false;
		var isEndSecond = false;

		do {
			System.out.println("Ход первого игрока: ");
			var stepFirst = scanner.nextLine();

			if (stepFirst.isEmpty()) {
				isEndFirst = true;
			} else {
				var isTrueLetters = true;

				for (int i = 0; i < stepFirst.length(); i++) {

					if (!letters.contains(stepFirst.charAt(i))) {
						System.out.println("Таких букв нет в слове!");
						isTrueLetters = false;
						break;
					}
				}

				if (wordsHistory.contains(stepFirst)) {
					System.out.println("Такое слово уже было");

				} else if (!wordsHistory.contains(stepFirst) && isTrueLetters) {
					wordsHistory.add(stepFirst);
				}
			}

			System.out.println("Ход второго игрока: ");
			var stepSecond = scanner.nextLine();

			if (stepSecond.isEmpty()) {
				isEndSecond = true;
			} else {
				var isTrueLetters = true;

				for (int i = 0; i < stepSecond.length(); i++) {
					if (!letters.contains(stepSecond.charAt(i))) {
						System.out.println("Таких букв нет в слове!");
						isTrueLetters = false;
						break;
					}
				}

				if (wordsHistory.contains(stepSecond)) {
					System.out.println("Такое слово уже было");

				} else if (!wordsHistory.contains(stepFirst) && isTrueLetters) {
					wordsHistory.add(stepSecond);
				}
			}

		} while (!isEndFirst && !isEndSecond);

		System.out.println("Игра окончена!");

		for (var s : wordsHistory) {
			System.out.println(s);
		}

	}

}
