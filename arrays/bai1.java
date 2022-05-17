package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		System.out.println("enter the size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int [n];
		String str = "";
		for(int i = 0; i < n ; i++) {
			a[i] = sc.nextInt();
			str = str + a[i];
			
		}
		
		String rev = "";
		System.out.println(str);
		for(int i = n - 1 ; i >= 0 ; i--) {
		
			rev = rev + a[i];
			
		}
	
		System.out.println(rev);
		if(rev.equals(str)) {
			System.out.println("Là mảng đối xứng");
		}
		else System.out.println("Không phải mảng đối xứng");
		
		
		
	}
}
