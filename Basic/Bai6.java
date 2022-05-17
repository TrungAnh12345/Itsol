package Basic;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số nguyên n");
		int n = sc.nextInt();
		int [] c = new int [n];
		int b = 0;
		for(int i=2;i<=n;++i)
        {   
			while(n%i==0){ 	 
	            n=n/i;
	            System.out.print(i + " x ");
	        } 	               	
        }
		
	}
}
