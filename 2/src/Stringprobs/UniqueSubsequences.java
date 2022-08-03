package Stringprobs;

public class UniqueSubsequences {

	public static void main(String[] args) {
		
		System.out.println(unique("ababaa"));

	}

	private static int unique(String st) {
		
		int maxLen =0;
		
		int len = st.length();
		int start =len-1, end = len-1;
		
		while(end > 0) {
//			if(end + 1 == len) {
//				return maxLen;
//			}
			if(st.charAt(end) != st.charAt(end-1)) {
				maxLen = Math.max(maxLen, start - end +2 );
			} else {
				start = end;
			}
			end--;
		}
		
		
		return maxLen;

	}

}
