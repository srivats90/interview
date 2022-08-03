package leetCodeIntermediate;

import java.util.*;

public class HeapConnectRopes {

	public static void main(String[] args) {
		connectRopes(new int[] {1, 3, 11, 5 ,2});

	}

	private static void connectRopes(int[] arr) {
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>((n1, n2) -> n1 - n2);
		
		for(int i=0; i< arr.length; i++) {
			minHeap.add(arr[i]);
		}
		int totalLen = 0;
		int tempLen = 0;
		
		while(minHeap.size() > 1) {
			tempLen = minHeap.poll() + minHeap.poll();
			totalLen += tempLen;
			minHeap.add(tempLen);
		}
		
		System.out.println(totalLen);

	}

}
