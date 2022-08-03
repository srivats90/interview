package Heap;

import java.util.*;
public class TopKFrequentNums {

	public static void main(String[] args) {
		
		topFreqNums(new int[] {5, 12, 11, 3, 11}, 2);

	}

	private static void topFreqNums(int[] arr, int k) {
		
		Map<Integer,Integer> freqMap = new HashMap<>();
		
		for(int a : arr) {
			freqMap.put(a, freqMap.getOrDefault(a, 0) + 1);
		}
		List<Integer> list = new ArrayList<>(k);
		PriorityQueue<Map.Entry<Integer, Integer>> maxHeap = new PriorityQueue<>((e1,e2) -> e2.getValue() - e1.getValue());
		
		maxHeap.addAll(freqMap.entrySet());
		
		for(int i = 0 ; i < k ; i++) {
			if(!maxHeap.isEmpty()) {
				list.add(maxHeap.poll().getKey());
			}
		}
		
		System.out.println(list.toString());
	}

}
