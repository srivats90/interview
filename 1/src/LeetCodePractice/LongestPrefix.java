package LeetCodePractice;

public class LongestPrefix {

	public static void main(String[] args) {
		
		String[] strs = {"flower","flow","flight"};
		
		System.out.println(strstr(strs));

	}
	
	public static String strstr(String[] strs) {
		for(int i= 0 ; i < strs[0].length(); i++){
			char c= strs[0].charAt(i);
			for(int j = 1; j < strs.length; j++) {
				//when you have reached the end or if the characters are not matching anymore
				if( i == strs[j].length()  || c != strs[j].charAt(i)) {
					return strs[0].substring(0, i);
				}
			}
		}
		return null;
	}

}
