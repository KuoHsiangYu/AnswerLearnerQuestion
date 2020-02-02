//a033
//http://www.tcgs.tc.edu.tw:1218/ShowProblem?problemid=a033
//https://www.facebook.com/groups/1403852566495675/permalink/2540297076184546/

#include <iostream>
#include <cstdio>
#include <string>

using namespace std;

int main(int argc, char *argv[]) {
	int n = 0;
	cin >> n;
	switch (n / 10) {
	case 0:
		printf("#0\n");
		cout << "|_______" << n << "|" << '\n';
		break;
	case 1:
		printf("#1\n");
		cout << "|______" << n << "|" << '\n';
		break;
	case 2:
		printf("#2\n");
		cout << "|_____" << n << "|" << '\n';
		break;
	case 3:
		printf("#3\n");
		cout << "|____" << n << "|" << '\n';
		break;
	case 4:
		printf("#4\n");
		cout << "|____" << n % 10000 << "|" << '\n';
		break;
	case 5:
		printf("#5\n");
		cout << "|____" << n % 100000 << "|" << '\n';
		break;
	case 6:
		printf("#6\n");
		cout << "|____" << n % 1000000 << "|" << '\n';
		break;
	case 7:
		printf("#7\n");
		cout << "|____" << n % 10000000 << "|" << '\n';
		break;
	default:
		printf("#default\n");
		break;
	}

	return 0;
}
