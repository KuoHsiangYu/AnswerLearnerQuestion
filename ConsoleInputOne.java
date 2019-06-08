package com.sample;
//´ú¸Õ¤¤¤å¦r
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class ConsoleInputOne {
	public static void main(String[] args) {
		InputStreamReader inputStreamReader = null;
		BufferedReader bufferedReader = null;
		String input = "";
		try {
			inputStreamReader = new InputStreamReader(System.in, "UTF-8");
			bufferedReader = new BufferedReader(inputStreamReader);
			System.out.print("Please enter a sentence: ");
			input = bufferedReader.readLine();
			System.out.println("Output = " + input);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (bufferedReader != null) {
				try {
					bufferedReader.close();
					bufferedReader = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if (inputStreamReader != null) {
				try {
					inputStreamReader.close();
					inputStreamReader = null;
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		System.out.println("finish");
	}// end of main method
}// end of ConsoleInputOne class