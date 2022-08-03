package leetCodeIntermediate;

import java.util.*;
public class HeapFrequencySort {

	public static void main(String[] args) {
		
		freqSort("Programming");

	}

	private static void freqSort(String in) {
		
		Map<Character, Integer> map = new HashMap<>();
		
		char[] arr = in.toCharArray();
		
		for(char c : arr) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}
		
		PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>((e1, e2) -> e2.getValue() - e1.getValue());
		
//		for(Map.Entry<Character, Integer> m : map.entrySet()) {
//			maxHeap.add(m);
//		}
		maxHeap.addAll(map.entrySet());
		
		String newStr = "";
		
		while(maxHeap.size() != 0) {
			Map.Entry<Character, Integer> entry = maxHeap.poll();
			for(int i= 0; i < entry.getValue(); i++) {
				newStr += entry.getKey();
			}
		}
		
		System.out.println(newStr);
		
	}

}
