package Basic;

public class Bai10 {

	static boolean checkSnt(int n) {
		
		for(int i = 2; i <= n / 2 ; i++) {
			if(n % i == 0) {
					return false;
				}
		}
		return true;
	}
	static boolean checkdigitPrime(int n) {
	
		while(n > 0) {
			int m = n % 10;
			if(m <= 1) {return false;}
			for(int i = 2; i <= m/2; i++) {
				if(m % i == 0) {
					return false;
				}
			}
			
			n = n/10;
		}
		return true;
	}
	static boolean checkDaoSnt(int n) {
		String str = String.valueOf(n);
		String rev = "";
		int size = str.length();
		for(int i = size - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
			
		}
		
		int con = Integer.parseInt(rev);
		for(int i = 2; i <= con/2; i++) {
			if(con % i == 0) {
				return false;
			}
			
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		System.out.println("the prime number is: ");
		for(int i = 1000000; i < 9999999; i++) {
			if(checkSnt(i) && checkdigitPrime(i) && checkDaoSnt(i)) {
				System.out.println(i);
			}
		}
	}
}
