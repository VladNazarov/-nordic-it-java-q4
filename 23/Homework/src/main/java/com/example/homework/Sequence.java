package com.example.homework;

public class Sequence {

	public static int maxSequence(String sequence) {
		if (sequence == null || sequence.isBlank()) {

			return 0;
		}

		var seqArray = sequence.toCharArray();
		var max = 0;
		var count = 0;
		var isOnlyOne = true;

		for (int i = 0; i < seqArray.length; i++) {
			if (seqArray[i] == '1') {
				count++;

			} else {
				isOnlyOne = false;
				if (count > max) {
					max = count;
				}
				count = 0;
			}
		}

		if (isOnlyOne) {
			max = count;
		}

		return max;
	}

}
