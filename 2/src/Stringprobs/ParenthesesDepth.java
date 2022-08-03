package Stringprobs;

//Input: s = "(1+(2*3)+((8)/4))+1"
//Output: 3
//Explanation: Digit 8 is inside of 3 nested parentheses in the string.

public class ParenthesesDepth {

	public static int depth(String input) {
		int count = 0;
		int left = 0, right = 0;
		for(int i=0; i<input.length();i++) {
			if(input.charAt(i) == '(')
				left++;
			else if(input.charAt(i) == ')')
				right++;
			if(left == right)
				left = right = 0;
			else
				if(count < (left-right))
				count = left - right;
			
//	          if (s.charAt(i) == '(') {
//	                count++;
//	            } else if (s.charAt(i) == ')') {
//	                count--;
//	            }
//	            max = Math.max(count, max);
//	        }
//	        return max;
		
		}
		
		return count;
	}
	public static void main(String[] args) {
		System.out.println(ParenthesesDepth.depth("(1+(2*3)+((8)/4))+1"));
		System.out.println(ParenthesesDepth.depth("(1)+((2))+(((3)))"));


	}

}
