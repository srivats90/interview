package prac;

import java.util.*;

public class IsomorphicStrings {

	public static void main(String[] args) {

		String s = "egg", t = "add";

		System.out.println(isomor(s, t));
		
		

	}

	private static boolean isomor(String s, String t) {
		if (s.length() != t.length())
			return false;
		LinkedHashMap<Character, Integer> sMap = new LinkedHashMap<>();
		LinkedHashMap<Character, Integer> tMap = new LinkedHashMap<>();

		for (int i = 0; i < s.length(); i++) {
			sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
			tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
		}
		
		Collection<Integer> sArr =  sMap.values();
		Collection<Integer> tArr =  tMap.values();
			
		if (sArr.size() != tArr.size())
			return false;

		if(new ArrayList<>(sArr).equals(new ArrayList<>(tArr)))
			return true;
		

		return false;
	}

}
