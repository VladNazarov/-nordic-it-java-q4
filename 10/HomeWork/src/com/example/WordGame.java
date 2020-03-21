package com.example;

import java.util.HashSet;
import java.util.Scanner;

public class WordGame {
	private static HashSet<Character> letters = new HashSet<Character>();
	private static HashSet<String> wordsHistory = new HashSet<String>();

	public static void main(String[] args) {
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
				if (!wordsHistory.contains(stepFirst) && checkWord(stepFirst)) {
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
				if (!wordsHistory.contains(stepSecond) && checkWord(stepSecond)) {
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

	private static boolean checkWord(String word) {
		var result = true;

		for (int i = 0; i < word.length(); i++) {
			if (!letters.contains(word.charAt(i))) {
				System.out.println("Таких букв нет в слове!");
				result = false;
				break;
			}
		}
		return result;
	}
}
