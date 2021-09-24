package com.example.stringcalculator;

public class Calculator {
	
	public static int add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;
		}else if(numbers.contains(",")) {
			String[] t = numbers.split(",");
			int sum=0;
			for(int i=0;i<t.length; i++) {
				sum+=toInt(t[i]);
			}
			return sum;
		}else {
			return toInt(numbers);
		}
	}
	
	private static int toInt(String a) throws NumberFormatException{
		return Integer.parseInt(a);
	}
}
