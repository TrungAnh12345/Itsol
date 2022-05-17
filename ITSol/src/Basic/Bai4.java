package Basic;

import java.util.Scanner;

public class Bai4 {

	static boolean checkSntCung(int a, int b) {
		int m = 0;
		for(int i = 2; i <= a && i <= b; i++) {
			if(a % i == 0 && b % i == 0) {
				m = i;
				if(m > 1) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		checkSntCung(a, b);
		for(int i = a; i <= b; i++) {
			for(int j = i + 1; j <= b; j++) {
				if(checkSntCung(i, j)) {
					System.out.println(i + " " + j);
				}
			}
		}
	
	}
}
