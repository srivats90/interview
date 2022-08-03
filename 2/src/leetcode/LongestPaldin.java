package leetcode;

public class LongestPaldin {
	static String newStr = "";
	static int maxLen = 0;
	public static void calcPalin(int left, int right , String input) {
					
		while( left >= 0 && right < input.length() && ( input.charAt(left) == input.charAt(right) )) {
			if(maxLen < right - left + 1) {
				maxLen = right - left +1;
				newStr = input.substring(left, right+1);			
			} 	
			left--;
			right++;
		}
		
	}
	public static void main(String[] args) {
		
		String input = "krabbabbahn";
		int left = 0;
		int right =0;
		for(int i=0; i< input.length() ; i++) {	
			if(input.length()%2 == 0) {
				left = i;
				right = i+1;
				calcPalin(left,right, input);
			} else {
				left = right = i;
				calcPalin(left,right, input);
			}			
		}
		System.out.println(newStr);
	}
}
