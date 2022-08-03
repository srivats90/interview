package leetcode;
import java.util.*;

public class LongestSubstring {

	public static int longestsub(String s) {
		
        int n = s.length(), ans = 0;
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)) + 1, i);
            }
            ans = Math.max(ans, j - i +1);
            map.put(s.charAt(j), j );
        }
        return ans;
	}
	
	public static String longestsubstring(String s) {
		
        int n = s.length(), ans = 0;
        String out="";
        Map<Character, Integer> map = new HashMap<>(); // current index of character
        // try to extend the range [i, j]
        for (int j = 0, i = 0; j < n; j++) {
            if (map.containsKey(s.charAt(j))) {
                i = Math.max(map.get(s.charAt(j)) +1, i);
            }
            if(out.length() < j-i +1) 
            	out = s.substring(i, j +1);
            map.put(s.charAt(j), j );
        }
        return out;
	}
	
	public static void main(String[] args) {
		int result = LongestSubstring.longestsub("krishnakumar");
		System.out.println("Result is " + result);
		System.out.println(LongestSubstring.longestsubstring("krishnakumabcdefg"));
	}
}
