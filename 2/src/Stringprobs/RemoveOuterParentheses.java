package Stringprobs;

public class RemoveOuterParentheses {

	public static String removeouter(String input) {
		StringBuilder sb = new StringBuilder();
		int right =0, left = 0;
		char[] c = input.toCharArray();
		for(int i=0; i < input.length(); i++) {
//			if(input.charAt(i) == '(' && input.charAt(i+1) == ')') {
//				sb.append(Character.toString(c[i]) + Character.toString(c[i+1]));
//			}
//			
			if(input.charAt(i) == '(') 
				left++;
			else
				right++;
			if(left == right) {
				if(left != 1) {
			    	sb.append(input.substring(i-right-left+1+1, i));
				} else 
					sb.append("()");
				left = right = 0;
			}
				
		}
		
		return sb.toString();
		
		
//	    public String removeOuterParentheses(String S) {
//	        StringBuilder s = new StringBuilder();
//	        int opened = 0;
//	        for (char c : S.toCharArray()) {
//	            if (c == '(' && opened++ > 0) s.append(c);
//	            if (c == ')' && opened-- > 1) s.append(c);
//	        }
//	        return s.toString();
//	    }
	}

	public static void main(String[] args) {

		System.out.println(RemoveOuterParentheses.removeouter("()()"));
	}

}
