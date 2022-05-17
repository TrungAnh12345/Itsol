package Basic;

public class Nhap {

	public static void main(String[] args) {
		int n = 1232354;
		String str = String.valueOf(n);
		String rev = "";
		int size = str.length();
		for(int i = size - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
			
		}
		System.out.println(rev);
		int con = Integer.parseInt(rev);
		System.out.println(con);
	}
}
