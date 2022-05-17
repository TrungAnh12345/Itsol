package arrays;

import java.util.Scanner;

public class Bai4 {

	static boolean checkSnt(int n) {
		if(n < 2) {
			return false;
		}
	
		for(int i = 2; i < n / 2; i++) {
			if(n % i == 0) {
				return false;
			}
			
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap so phan tu");
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			
		}
		System.out.println("enter random number");
		int x = sc.nextInt();
		int count = 0;
		int putNum = 0;
		int pos = arr[0];
		int min = 99;
		int inMin = 0;
		for (int i = 0; i < arr.length; i++) {
			if(checkSnt(arr[i])) {
				if(arr[i] > x) {
					count = arr[i] - x;
					if(min >= count) {
						min = count;
						pos = i;
						putNum = arr[i];
					}
				
				}
				if(arr[i] <= x) {
					count = x - arr[i];
					if(min >= count) {
						min = count;
						pos = i;
						putNum = arr[i];
					}
				} 
			}
			
		}
		
		System.out.println("số nguyên tố gần " + x + " Nhất " + " là " + putNum + " tại vị trí " + pos);
		
		
		
	}
}
