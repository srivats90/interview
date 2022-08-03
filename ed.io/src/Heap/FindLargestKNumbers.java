package Heap;

import java.util.*;
public class FindLargestKNumbers {

	public static void main(String[] args) {
		
		findLarge(new int[] {3, 1, 5, 12, 2, 11}, 3);

	}

	private static void findLarge(int[] arr, int k) {
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>((n1, n2) -> n1 - n2);
		
		for(int i = 0; i < 3; i++) {
			minHeap.add(arr[i]);
		}
		
		System.out.println(minHeap.toString());
		
		for(int j=k; j<arr.length;j++) {
			if(arr[j] > minHeap.peek()) {
				minHeap.poll();
				minHeap.add(arr[j]);
			}
		}
		
		List<Integer> list = new ArrayList<>(minHeap);
		
		System.out.println(list.toString());
		
	}

}
