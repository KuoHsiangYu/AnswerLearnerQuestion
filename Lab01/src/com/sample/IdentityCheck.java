package com.sample;

public class IdentityCheck {
	// 身分證檢查演算法
	// ID=D0D1D2D3D4D5D6D7D8D9
	// D0為英文字母：
	// A=10、B=11、C=12、D=13、E=14、F=15、G=16、H=17、I=34、J=18、K=19、L=20、M=21、N=22、O=35、P=23、Q=24、R=25、S=26、T=27、U=28、V=29、W=32、X=30、Y=31、Z=33
	// X1 = D0的十位數
	// X2 = D0的個位數
	char[] key1 = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
			'U', 'V', 'W', 'X', 'Y', 'Z' };
	int[] value1 = { 10, 11, 12, 13, 14, 15, 16, 17, 34, 18, 19, 20, 21, 22, 35, 23, 24, 25, 26, 27, 28, 29, 32, 30, 31,
			33 };
	int[] id = new int[10];

	private boolean isLegal(String input) {
		// 判斷使用者輸入的資料是否是合法的？
		if (input == null) {
			return false;
		}
		if (input.length() != 10) {
			return false;
		}
//		if (false == Character.isAlphabetic(input.charAt(0))) {
//			return false;
//		}
		char firstLetter = input.toUpperCase().charAt(0);
		if (firstLetter < 'A' || firstLetter > 'Z') {
			return false;
		}
		for (int i = 1; i < input.length(); i++) {
//			if (Character.isDigit(input.charAt(i)) == false) {
//				return false;
//			}
			if (input.charAt(i) < '0' || input.charAt(i) > '9') {
				return false;
			}
		}
		return true;
	}

	public boolean check(String input) {
		boolean judge = this.isLegal(input);
		if (false == judge) {
			System.out.println("Error. 不合法的身分證格式");
			return false;
		}
		char c1 = input.toUpperCase().charAt(0);
		for (int i = 1; i < input.length(); i++) {
			id[i] = Integer.parseInt(new StringBuilder().append(input.charAt(i)).toString());
		}
		for (int i = 0; i < key1.length; i++) {
			if (c1 == key1[i]) {
				id[0] = value1[i];
			}
		}
		int x1 = id[0] / 10;
		int x2 = id[0] % 10;
		// System.out.println("id[0] / 10 -> " + (id[0] / 10));
		// System.out.println("id[0] % 10 -> " + (id[0] % 10));
		int y = x1 + 9 * x2 + 8 * id[1] + 7 * id[2] + 6 * id[3] + 5 * id[4] + 4 * id[5] + 3 * id[6] + 2 * id[7] + id[8];
		int checkCode = (10 - (y % 10)) % 10;
		// System.out.println("y -> " + y);
		// System.out.println("checkCode -> " + checkCode);
		if (checkCode == id[9]) {
			return true;
		} else {
			return false;
		}
	}
}
