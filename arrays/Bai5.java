package arrays;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of array a");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("enter the size of array b");
		int m = sc.nextInt();
		int [] brr = new int[m];
	
		int nNum = n;
		System.out.println("enter arrray a");
		for(int i = 0 ; i < arr.length; i ++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter arrray b");
		for(int i = 0; i < m; i ++) {
			brr[i] = sc.nextInt();
		}
		
		System.out.println("enter the position to insert ");
		int p = sc.nextInt();
		int soP = p;
		int temp = 0;
		for(int i = p; i <= m + p; i++) {
		
			if(i < i - p) {
				temp = arr[i];
				arr[i] = brr[i - p];
				brr[i - p] = temp;
			}
			
			n++;
			
		}
		for(int i = 0; i < n;i++) {
			System.out.println(arr[i]);
		}


		
		
		
		
	}
}
