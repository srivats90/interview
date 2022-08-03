package practice;

import java.util.*;
public class LongestSubstring {

	public static void main(String[] args) {
		
		String str = "aabccbb";
		
		Map<Character, Integer> map = new HashMap<>();
		
		int start = 0, end = 0;
		int maxLen = 0;
		
		for(end = 0 ; end < str.length(); end++) {
			if(map.containsKey(str.charAt(end))) {
				start = Math.max(start, map.get(str.charAt(end)) + 1);
			}
			maxLen = Math.max(end - start + 1, maxLen);
			map.put(str.charAt(end), end);
			
		}

		System.out.println(maxLen);
	}

}
