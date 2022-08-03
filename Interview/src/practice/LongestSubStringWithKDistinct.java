package practice;

import java.util.*;

public class LongestSubStringWithKDistinct {

	public static void main(String[] args) {

		String str = "cbbebi";

		int start = 0;
		int k = 10;
		int maxLen = Integer.MIN_VALUE;
		Map<Character, Integer> map = new HashMap<>();
		for (int end = 0; end < str.length(); end++) {

			char c = str.charAt(end);
			map.put(c, map.getOrDefault(c, 0) + 1);

			while (map.size() > k) {
				int charCount = map.get(str.charAt(start));
				if (charCount > 1)
					map.put(str.charAt(start), charCount - 1);
				else
					map.remove(str.charAt(start));
				start++;
			}
			maxLen = Math.max(maxLen, end - start + 1);
		}

		System.out.println(maxLen);

	}

}
