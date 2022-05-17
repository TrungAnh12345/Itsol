package arrays;

import java.util.Scanner;

public class Bai8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Nhập hàng cột của 2 mảng:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int p = scan.nextInt();
		int x[][] = new int[a][b];
		int e[][] = new int[b][p];
		int h[][]= new int[a][p];
		System.out.println("mảng 1:");
		for(int i=0; i<a;++i)
			for(int j=0; j<b;++j){
			x[i][j] = scan.nextInt();
		}
		System.out.println("mảng 2:");
		for(int i=0; i<b;++i)
			for(int j =0; j<p;++j){
				e[i][j] = scan.nextInt();
			}
		for(int i = 0; i<a;++i)
			for(int j = 0; j<p;++j)
				for(int k = 0;k < b;++k){
				  h[i][j] += x[i][k] *e[k][j];
			}
		 for (int i = 0; i < h.length; i++) {
             for (int j = 0; j < h.length; j++) {
                 System.out.print(h[i][j] + "\t");
             }
             System.out.println("\n");
         }
	
	}
}
