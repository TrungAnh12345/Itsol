package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n];
		System.out.println("");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
					
		} 
		int temp = arr[0];
		for(int i = 0;i < n ; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
							
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
