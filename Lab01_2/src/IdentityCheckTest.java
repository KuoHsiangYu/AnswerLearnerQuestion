import static java.lang.System.out;

import java.util.Scanner;

public class IdentityCheckTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String testID = "";
		out.print("請輸入身份證字號：");
		testID = scanner.next();
		IdentityCheck identityCheck = new IdentityCheck();
		boolean checkID = identityCheck.check(testID);

		// A123456789
		if (true == checkID) {
			out.println("Yes. 這是合法的身分證字號");
		} else {
			out.println("No. 這是不合法的身分證字號");
		}

		if (scanner != null) {
			scanner.close();
			scanner = null;
		}
		out.println("finish");
	}// end of main method
}