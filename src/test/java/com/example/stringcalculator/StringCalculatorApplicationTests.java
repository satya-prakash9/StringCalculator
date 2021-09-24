package com.example.stringcalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StringCalculatorApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void shoudReturnZeroWhenEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
	
	@Test
	void shouldReturnNumberWhenNumber() {
		assertEquals(1, Calculator.add("1"));
	}
	
}
