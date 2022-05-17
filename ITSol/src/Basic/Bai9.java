package Basic;

public class Bai9 {

	static boolean ktraThuanNghich(int n) {
		String str = String.valueOf(n);
		int size = str.length();
		for(int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i) != str.charAt(size - i - 1)) {
				return false;
			}
		}
		return true;
	}
	static boolean ktradk2(int n) {
		while(n > 0) {
			
			if(n%10 != 6 && n % 10 != 8 && n % 10 != 0) {
				return false;
			}
			n = n/10; 
		}
		return true;
	}
	
	static boolean ktradk3(int n) {
		int count = 0;
		int div = 0;
		while(n > 0) {
			div = n % 10;
			count = count + div;
			n = n / 10;
			
		}
		if(count % 10 != 0) {
			return false;
		}
		return true;
		
	}
	public static void main(String[] args) {
		System.out.println("Các số thuận nghịch: ");
		for(int i = 1000000; i < 100000000; i++) {
			if(ktraThuanNghich(i) && ktradk2(i) && ktradk3(i)) {
				System.out.println(i);
			}
		}
	}
}
