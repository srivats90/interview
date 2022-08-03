package leetCodeIntermediate;

import java.util.*;
public class HeapTopKFrequentNumbers {

	public static void main(String[] args) {
		
		topKFreq(new int[] {1, 3, 5, 12, 11, 12, 11 }, 2);

	}

	private static void topKFreq(int[] arr, int k) {
		
		Map<Integer, Integer> freqMap = new HashMap<>();
		
		for(int i : arr) {
			freqMap.put(i, freqMap.getOrDefault(i, 0) + 1);
		}
		
		PriorityQueue<Map.Entry<Integer, Integer>> minHeap = new PriorityQueue<>((e1, e2) -> e1.getValue() - e2.getValue());
		
		for(Map.Entry<Integer, Integer> e : freqMap.entrySet()) {
			minHeap.add(e);
			if(minHeap.size() > k) {
				minHeap.poll();
			}
		}
		
		List<Integer> list = new ArrayList<>();
		
		while(minHeap.size() != 0) {
			list.add(minHeap.poll().getKey());
		}
		
		list.forEach(s -> System.out.println(s));
		
	}

}
