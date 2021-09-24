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
	
	//test4
	@Test
	void shouldReturnSumOnMultipleNumberDelimitedByComma() {
		assertEquals(6, Calculator.add("1,2,3"));
	}
	
	//test5
	@Test
	void shoudAcceptNewLineAsValidDelimiter() {
		assertEquals(6, Calculator.add("1,2\n3"));
	}
	
	//test6
	@Test
	void shouldAcceptCustomDelimiters() {
		assertEquals("3", Calculator.add("//;\n1;2"));
	}
	
}