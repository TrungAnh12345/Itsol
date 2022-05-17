package Basic;

import java.util.Scanner;

public class Bai1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("task a");
		System.out.println("Enter n");
		int n = sc.nextInt();
		int count2 = 0;
		int count1 = 0;
		for(int i = 1; i <= n; i++) {
			if(i % 2 != 0) {
				count1 = count1 + i;
				
			}
			else {
				count2 = count2 + i;
				
			}
		}
		System.out.println(count1);
		System.out.println(count2);
		
		
		
		System.out.println("task b");
		System.out.println("enter number");
		int number = sc.nextInt();
		
		float res = 0;
		for(int i = 1; i <= number; i++) {
			res += (float) 1 / i;
	
		}
		System.out.println(res);
		
	}
}
