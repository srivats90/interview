package leetCodeIntermediate;
import java.util.*;
public class LongestSubStringWithKDistinctChar {

	public static void subs(String input , int k) {
		
		Map<Character, Integer> map = new HashMap<>();
		int maxLen = 0;
		int start = 0;
		for(int end = 0; end< input.length() ; end++) {
			char endChar = input.charAt(end);
			map.put(endChar, map.getOrDefault(endChar, 0) + 1);
			
			while(map.size() > k) {
				char leftChar = input.charAt(start);
				map.put(leftChar, map.get(leftChar) - 1);
				
				if(map.get(leftChar) == 0) {
					map.remove(leftChar);
				}
				start++;
			}
			maxLen = Math.max(maxLen, end - start + 1);
		}
		
		System.out.println(maxLen);
	}
	public static void main(String[] args) {
		
		subs("eceba" , 2);

	}

}
