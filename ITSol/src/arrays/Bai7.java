package arrays;

import java.util.Scanner;

public class Bai7 {

	static void ktraDay(int a[]) {
		for(int i = 0; i < )
		
	}
	
	public static void main(String[] args) {
		
		System.out.println("enter the size of array");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] a = new int [n];
		

		for(int i = 0;i < n; i++) {
			a[i] = sc.nextInt();
		}
		int pos = 0;
		int max = 0;
		int count  = 0;
		for(int i = 0;i < n; i++) {
			while(a[i] <= a[i + 1]) {
				if(a[i] < a[i + 1]) {
					System.out.println(a[i]);
				}
				
				count++;
				i++;
				
			} 
			if(max < count) {
				max = count;
				
			}
			
		}
		System.out.println("Đường chạy dài nhất là " + max );
		
		
	}
}
