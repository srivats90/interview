package Maths;

public class Replace0s {

	public static void main(String[] args) {
		
		int n = 1001001;
		
		if(n == 0) {
			System.out.println(n);
		} else {
			System.out.println(replace(n));
		}
	}

	private static int replace(int n) {
		if(n == 0)
			return 0;
		
		int digit = n % 10;
		
		if(digit == 0){
			digit = 1;
		}
				
		n = replace(n/10) * 10 + digit;
		return n;
	}

}
