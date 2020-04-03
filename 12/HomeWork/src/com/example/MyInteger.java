package com.example;

public class MyInteger implements Comparable<MyInteger> {
	private Integer data;

	public MyInteger() {

	}

	public MyInteger(int data) {
		this.data = data;
	}

	private Integer simpleCount() {
		Integer count = 0;

		for (int i = 2; i < this.data; i++) {
			var isSimple = true;

			if (data % i == 0) {

				for (int j = 2; j < i; j++) {

					if (i % j == 0) {
						isSimple = false;
						break;
					}
				}

				if (isSimple) {
					count++;
				}
			}
		}
		return count;

	}

	@Override
	public String toString() {
		return data.toString();
	}

	@Override
	public int compareTo(MyInteger o) {

		return this.simpleCount().compareTo(o.simpleCount());
	}
}