package Basic;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 0;
		System.out.println("Uoc số của n");
		for(int i = 1; i <= n; i++) {
			if(n % i == 0) {
				System.out.println(i);
				res = res + 1;
			}
			
		}
		System.out.println("số lượng ước của n " + res);
		
	}
}
