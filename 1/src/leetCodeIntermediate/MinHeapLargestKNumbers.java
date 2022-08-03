package leetCodeIntermediate;

import java.util.*;

public class MinHeapLargestKNumbers {

	public static void main(String[] args) {
		minHeapLargest(new int[] {3, 1, 5,12,2,11}, 3);

	}

	private static void minHeapLargest(int[] arr, int k) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);
		
		for(int i=0; i < k; i++) {
			minHeap.add(arr[i]);
		}
		
		for(int j=k ; j < arr.length; j++) {
			if(arr[j] > minHeap.peek()) {
				minHeap.poll(); // retrieve and removes the head of the heap
				minHeap.add(arr[j]);
			}
		}
		
		minHeap.forEach(s -> System.out.println(s));
		
	}

}
