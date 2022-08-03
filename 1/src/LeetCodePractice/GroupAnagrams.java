package LeetCodePractice;

import java.util.*;
public class GroupAnagrams {

	public static void main(String[] args) {
		
		String[] arr = {"eat","tea","tan","ate","nat","bat"};
		Map<String, List<String>> map = new HashMap<>();
		List<List<String>> list = new ArrayList<>();
		for(String a : arr) {
			char[] cArr = a.toCharArray();
			Arrays.sort(cArr);
			String sorted = String.valueOf(cArr);
			
			if(map.containsKey(sorted)) {
				List<String> lst = map.get(sorted);
				lst.add(a);
			} else {
				List<String> lst = new ArrayList<>();
				lst.add(a);
				map.put(sorted, lst);
			}
		}
		
	//	System.out.println(map.toString());
		map.forEach((k,v) -> list.add(v));
		
		System.out.println(list.toString());
	}

}
