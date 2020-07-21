package com.example.Homework;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.example.homework.Sequence;

@ExtendWith(SpringExtension.class)
public class SequenceTests {

	@Test
	@DisplayName("Проверка макс. последовательности единиц")
	public void testSequence() {
		var result = Sequence.maxSequence("00011010011110");
		var expected = 4;

		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Проверка на null")
	public void testNullSequence() {
		var result = Sequence.maxSequence(null);
		var expected = 0;

		assertEquals(expected, result);

	}

	@Test
	@DisplayName("Проверка на отсутствие единиц")
	public void testWithoutOne() {
		var result = Sequence.maxSequence("00000000");
		var expected = 0;

		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Проверка на отсутствие нулей")
	public void testWithoutNull() {
		var result = Sequence.maxSequence("11111111");
		var expected = 8;

		assertEquals(expected, result);
	}

	@Test
	@DisplayName("Все последовательности одинаковые")
	public void testIdenticalMaxSequence() {
		var result = Sequence.maxSequence("111000111000111011100000");
		var expected = 3;

		assertEquals(expected, result);
	}

	@Test
	@DisplayName("В строке сторонние символы")
	public void testForeignChars() {
		var result = Sequence.maxSequence("0011hgd111110j@l");
		var expected = 5;

		assertEquals(expected, result);
	}
}
