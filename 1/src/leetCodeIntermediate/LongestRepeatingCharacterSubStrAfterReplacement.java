package leetCodeIntermediate;

import java.util.*;

public class LongestRepeatingCharacterSubStrAfterReplacement {

	public static void main(String[] args) {

		longReap("ABAB", 2);

	}

	private static void longReap(String in, int K) {

		Map<Character, Integer> freqMap = new HashMap<>();

		int start = 0;
		int maxLen = Integer.MIN_VALUE;
	
		int maxCountofRepeatChars = 0;
		for (int end = 0; end < in.length(); end++) {

			freqMap.put(in.charAt(end), freqMap.getOrDefault(in.charAt(end), 0) + 1);
			maxCountofRepeatChars = Math.max(maxCountofRepeatChars, freqMap.get(in.charAt(end)));
			
			if(end - start + 1 - maxCountofRepeatChars > K) {
				char startChar = in.charAt(start);
				freqMap.put(startChar, freqMap.get(startChar) - 1);
				start++;
			}
			maxLen = Math.max(maxLen, end - start + 1);
		}
		System.out.println(maxLen);

	}

}
