package Stringprobs;

public class Balanced {

	public static int balanced(String s) {
//		int count = 0;
//		int skip = 0;
//		int i=0;
//		while(i<input.length()) {
//			if(input.charAt(i) != input.charAt(i+1)) {
//				count++;
//				i+=2;
//				if(skip != 0) {
//					i+=skip;
//					skip = 0;
//				}			
//			}
//			else {
//				skip++;
//				i++;
//				continue;
//			}			
//		}
//		
        if (s == null || s.length() == 0)
            return 0;
        int left = 0, right = 0, score = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'L')
                left++;
            else
                right++;
            if (left == right) 
                score++;
        }
        return score;
		
		
	}
	public static void main(String[] args) {
		System.out.println(Balanced.balanced("RLRRRLLRLL"));
	}

}
