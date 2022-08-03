package leetCodeIntermediate;

import java.util.*;
public class GroupAnagrams {

	public static void main(String[] args) {
		
		String[] arr = {"eat","tea","tan","ate","nat","bat"};
		
		Map<String,List<String>> map = new HashMap<>();
		
		for(String s : arr) {
			char[] cArr = s.toCharArray();
			Arrays.sort(cArr);
			String key = String.valueOf(cArr);
			
			if(!map.containsKey(key)) {
				map.put(key, new ArrayList<>(List.of(s)));
			} else {
				List<String> a = map.get(key);
				a.add(s);
				map.put(key, a);
			}
		}
		
		System.out.println(map.values().toString());
		
	}
	
}
