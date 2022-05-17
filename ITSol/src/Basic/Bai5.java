package Basic;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int total = 0;
		while(n > 0) {
			total = total + n % 10;
			n = n / 10;
		}
		System.out.println("Tổng = " + total);
	}
}
