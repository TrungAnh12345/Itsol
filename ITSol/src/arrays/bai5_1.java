package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class bai5_1 {

	static void insertarray(int[]n, int [] m, int pos, int [] box) {
		int size = n.length + m.length;
		
		for(int i = 0; i < pos; i++) {
			box[i] = n[i];
		}
		for(int i = pos; i < m.length + pos; i++) {
			box[i] = m[i - pos];
		}
		 
		int t = pos;
		for(int i = m.length + pos; i < size; i++) {
			box[i] = n[t];
			t++;
		}
		System.out.println(Arrays.toString(box));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the size of array a");
		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.println("enter the size of array b");
		int m = sc.nextInt();
		int [] brr = new int[m];
		int [] bigArray = new int[m + n];
		System.out.println("enter arrray a");
		for(int i = 0 ; i < arr.length; i ++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter arrray b");
		for(int i = 0; i < m; i ++) {
			brr[i] = sc.nextInt();
		}
		System.out.println("Enter position to insert");
		int pos = sc.nextInt();
		insertarray(arr, brr, pos, bigArray);
	
	}
}
