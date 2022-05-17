package arrays;

import java.util.Scanner;

public class Bai3nhap {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int n = sc.nextInt();
		
		int [] arr = new int [n];

		
		int max = 1;
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int temp = 0;
		for(int i = 0;i < n ; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
							
				}
			}
		}
		
		int putNum = 0;
		for(int i = 0; i < arr.length; i++) {
			int count = 1;
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j]) {
					count = count + 1;
					
				}
				else {
					count = 1;
				}
							
			}
			
			System.out.println(arr[i] + " have " + count +  " lan");
			if(count > max) {
				max = count;
				putNum = arr[i];
			}
		}
		System.out.println("Phaàn tử xuất hiện nhiều nhất " + putNum);
		
	}
		
	
}
