package Basic;

import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("Cac số thuận nghich có 6 chữ số và tổng chia hết cho 10");
		for(int i = 100000; i <= 999999; i++) {
			if(isThuanNghich(i) && Ktradk(i)) {
				System.out.println(i);
			
			}
		}
		
	}
	static boolean Ktradk (int n) {
		int count = 0;
		//1234
		while( n > 0) {
			int a = n % 10;
			count = count + a;
			
			n = n/10;
		}
		if(count != 10)
		return false;
		
		return true;
	}
	
	public static boolean isThuanNghich(int n) {
		String numberStr = String.valueOf(n);
		int size = numberStr.length();
		for(int i =  0; i < (size/2); i++) {
			if(numberStr.charAt(i) != numberStr.charAt(size - i - 1)) {
				return false;
			}
		}
		return true;
	}
		
	
}
