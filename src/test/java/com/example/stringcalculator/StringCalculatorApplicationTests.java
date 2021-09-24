package com.example.stringcalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StringCalculatorApplicationTests {

	@Test
	void contextLoads() {
	}
	
	//test 1
	@Test
	void shoudReturnZeroWhenEmptyString() {
		assertEquals(0, Calculator.add(""));
	}
	
	//test 2
	@Test
	void shouldReturnNumberWhenNumber() {
		assertEquals(1, Calculator.add("1"));
	}
	
	//test3
	@Test
	void shouldReturnSumOnTwoNumberDelimitedByComma() {
		assertEquals(3, Calculator.add("1,2"));
	}
	
}