package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of array a");
		int n = sc.nextInt();
		int [] arr = new int[n];
		int temp = 0;
		System.out.println("enter arrray a");
		for(int i = 0 ; i < arr.length; i ++) {
			arr[i] = sc.nextInt();
		
		}
		System.out.println(Arrays.toString(arr));
		for(int i = 0;i < n ; i++) {
			for(int j = 0; j < n - i - 1; j++) {
				if(arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
							
				}
			}
		}
		
		
		int [] box = new int[n + 1];
		System.out.println("Nhập số cần chèn");
		int dem = 0;
		int pos = sc.nextInt();
		for(int element : arr) {
			box[dem] = element;
			dem++;
		}
		box[n] = pos;
		System.out.println("mảng sau khi chèn");
		
		for(int i = 0;i < n ; i++) {
			for(int j = 0; j < (box.length) - i - 1; j++) {
				if(box[j] > box[j + 1]) {
					temp = box[j];
					box[j] = box[j + 1];
					box[j + 1] = temp;
							
				}
			}
		}
		System.out.println(Arrays.toString(box));
	}
}
