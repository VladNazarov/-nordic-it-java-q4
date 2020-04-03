package com.example;

import java.util.Iterator;

public class MyInteger implements Iterable<Integer> {
	private Integer data;

	public MyInteger() {

	}

	public MyInteger(Integer data) {
		this.data = data;
	}

	@Override
	public Iterator<Integer> iterator() {
		return new DigitIterator();
	}

	public class DigitIterator implements Iterator<Integer> {

		private Integer localData = data;

		@Override
		public boolean hasNext() {
			return localData != 0;
		}

		@Override
		public Integer next() {

			var result = localData;
			var count = 1;

			while (result != 0) {
				result /= 10;

				if (result != 0) {
					count *= 10;
				}
			}

			result = localData / count;
			localData %= count;

			return result;
		}

	}

}