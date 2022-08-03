package Maths;

public class MultiplyStrings {

	public static void main(String[] args) {
		multiply("123", "456");

	}

	private static void multiply(String a, String b) {
		
		int n1 = convert(a);
		int n2 = convert(b);
		
		System.out.println();
		
	}

	private static int convert(String a) {
		int[] arr = {1,10,100,1000,10000};
		int len = a.length();
		int res = 0;
		int cp = len;
		for(int i = 0 ; i < len ; i++) {
			int temp = a.charAt(i) - '0';
			res = res + temp*arr[cp-1];
			cp--;
		}
		System.out.println(res);
		return res;
	}

}
