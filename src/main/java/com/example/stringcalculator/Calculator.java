package com.example.stringcalculator;

public class Calculator {
	
	public static int add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;
		}else{
			String[] t = splitNumbers(numbers, ",|\n");
			int sum=0;
			for(int i=0;i<t.length; i++) {
				sum+=toInt(t[i]);
			}
			return sum;
		}
	}
	
	private static String[] splitNumbers(String numbers, String delimiter) {
		return numbers.split(delimiter);
	}
	
	private static int toInt(String a) throws NumberFormatException{
		return Integer.parseInt(a);
	}
}
