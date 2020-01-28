package test;

import java.util.Scanner;

import com.sample.IdentityCheck;

public class IdentityCheckTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String testID = "";
		System.out.print("請輸入身份證字號：");
		testID = scanner.next();
		IdentityCheck identityCheck = new IdentityCheck();
		// System.out.println("身分證字號 = " + testID);
		boolean checkB = identityCheck.check(testID);

		// A123456789
		// M140051653
		if (true == checkB) {
			System.out.println("Yes. 這是合法的身分證字號");
		} else {
			System.out.println("No. 這是不合法的身分證字號");
		}

		if (scanner != null) {
			scanner.close();
			scanner = null;
		}
		
		System.out.println("finish");
	}// end of main method
}