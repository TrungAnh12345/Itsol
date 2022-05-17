package Basic;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int UCLN = 0;
		int bcnn = 0;
		for(int i = 1; i <= a * b; i++) {
			if(a % i == 0 && b % i == 0) {
				if(UCLN < i) {
					UCLN = i;
				}
			}
			if(i % a == 0 && i % b == 0) {
				bcnn = i;
				break; 
			}
		}
		System.out.println("bcnn : " + bcnn);
		System.out.println("ucln: " + UCLN);
		
	}
	
}
