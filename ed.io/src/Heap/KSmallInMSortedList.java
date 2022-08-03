package Heap;

import java.util.*;
public class KSmallInMSortedList {

	public static void main(String[] args) {
		
		//do as ListNode
		
		List<List<Integer>> list = new ArrayList<>(List.of( List.of(2,6,8), List.of(3,6,7), List.of(1,3,4)));
		
		mSorted(list, 5);
	}

	private static void mSorted(List<List<Integer>> list, int k) {
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>((n1,n2) -> n1 - n2);
	
	}

}
