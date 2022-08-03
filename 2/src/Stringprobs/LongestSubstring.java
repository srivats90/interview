package Stringprobs;

import java.util.*;
public class LongestSubstring {

	public static int substring(String input) {
		int ans = 0;
		String out = "";
		int i=0, j =0;
		Map<Character, Integer> map = new HashMap<>();
		
		for(j=0, i=0; j < input.length() ; j++) {
			if(map.containsKey(input.charAt(j))) {
				i = Math.max(map.get(input.charAt(j)) + 1, i);
			}
			ans = Math.max(j - i +1, ans);
			if(out.length() < j - i +1) {
				out = input.substring( i , j +1 );
			}
			map.put(input.charAt(j), j);
		}
		System.out.println(out);
		return ans;
	}
	public static void main(String[] args) {

		System.out.println(LongestSubstring.substring("krishnakumar"));
	}

}
