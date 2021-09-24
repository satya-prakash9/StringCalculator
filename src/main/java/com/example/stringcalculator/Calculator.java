package com.example.stringcalculator;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {
	
	public static int add(String numbers) {
		if(numbers.isEmpty()) {
			return 0;
		}else{
			String[] t = splitNumbers(numbers);
			int sum=0;
			String negatives = "";
			for(int i=0;i<t.length; i++) {
				int n = toInt(t[i]);
				if(n<0) {
					negatives+=n+" ";
				}else {
					sum+=n;
				}
			}
			if(!negatives.isEmpty()) {
				String message = "negatives not allowed ";
				throw new RuntimeException(message+negatives.trim());
			}
			return sum;
		}
	}
	
	private static String[] splitNumbers(String numbers) {
		if(numbers.startsWith("//")) {
			Matcher m = Pattern.compile("//(.)\n(.*)").matcher(numbers);
			m.matches();
			String customDelimiter = m.group(1);
			String data =  m.group(2);
			return data.split(customDelimiter);
		}
		return numbers.split(",|\n");
	}
	
	private static int toInt(String a) throws NumberFormatException{
		return Integer.parseInt(a);
	}
}
