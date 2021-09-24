package com.example.stringcalculator;

public class Calculator {
	
	public static int add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;
		}else if(numbers.contains(",")) {
			String[] t = numbers.split(",");
			return Integer.parseInt(t[0]) + Integer.parseInt(t[1]);
		}else {
			return Integer.parseInt(numbers);
		}
	}
}
