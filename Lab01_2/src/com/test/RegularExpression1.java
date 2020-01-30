package com.test;

import static java.lang.System.out;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 做正則表達式的實驗
		String input = "A123456789";
		input = input.toUpperCase();
		Pattern pattern = Pattern.compile("[A-Z]{1}[0-9]{9}");
		Matcher matcher = pattern.matcher(input);
		out.printf("[%s] matcher -> %b%n", input, matcher.matches());
		out.println("finish");
	}
}