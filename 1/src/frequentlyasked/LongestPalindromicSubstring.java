package frequentlyasked;

public class LongestPalindromicSubstring {
	static String maxStr = "";
	static int maxLen = 0;
	
	public static void calcpaldin(int left, int right , String input) {
		
		while(left >= 0 && right < input.length() && (input.charAt(left) == input.charAt(right))) {
			if(right - left + 1 > maxLen) {
				maxLen = right - left + 1;
				maxStr = input.substring(left, right + 1);
			}
			left -= 1;
			right += 1;
		}
	}
	
	public static String longestpalind(String input) {
				
		for(int i=0; i< input.length() ; i++) {
			if(input.length()%2 == 0) {
			int left = i;
			int right = i + 1;
			calcpaldin(left, right , input);
			}
			else {
				int left = i;
				int right = i;
				calcpaldin(left, right ,input);
			}

		}
		
		return maxStr;
	}

	public static void main(String[] args) {
		System.out.println(LongestPalindromicSubstring.longestpalind("babad"));
		// TODO Auto-generated method stub

	}

}

//https://www.youtube.com/watch?v=XYQecbcd6_c

//Starting in the middle and expanding outwards