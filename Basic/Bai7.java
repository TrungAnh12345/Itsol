package Basic;

import java.util.Scanner;

public class Bai7 {

	
	public static boolean checkSnt(int n) {
        if(n < 2) {
        	return false;
        }
        for (int i = 2; i <= n / 2 ; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
		
	}
	
	
	static boolean soLe(int n) {
  	  int a;
  	  while(n > 0) { //  12345
  		if((n % 10) % 2==0) 
			  return false;
  		 n/=10;
  		  
  	  }
  	  return true;
	}
	public static void main(String[] args) {
		for(int i = 100000; i < 999999; i++ ) {
			if(checkSnt(i) && soLe(i)) {
				System.out.println(i + " ");
			}
		}
        
		
		
	}
	
	
}
