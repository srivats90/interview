package leetCodeIntermediate;

import java.util.*;

public class HeapMergeKSortedLists {

	public static void main(String[] args) {
		
		ListNode a = new ListNode(2);
		a.next = new ListNode(6);
		a.next.next = new ListNode(8);
		
		ListNode b = new ListNode(3);
		b.next = new ListNode(6);
		b.next.next = new ListNode(7);
		
		ListNode c = new ListNode(1);
		c.next = new ListNode(3);
		c.next.next = new ListNode(4);
		
		mergeSort(new ListNode[] {a ,b ,c});
		
		
//		int[] arr = {9,5,1,3,4};
//		
//		PriorityQueue<Integer> minHeap = new PriorityQueue<>((n1, n2) -> n2 - n1);
//		
//		for(int i : arr) {
//			minHeap.add(i);
//		}
//		
//		while(!minHeap.isEmpty()) {
//			System.out.println(minHeap.poll());
//		}

	}

	private static void mergeSort(ListNode[] lists) {
		// TODO Auto-generated method stub
		
		PriorityQueue<ListNode> minHeap = new PriorityQueue<>((l1, l2) -> l1.value - l2.value);
		
		for(ListNode root : lists) {
			if(root != null)
				minHeap.add(root);
		}
		
		ListNode head = null;
		ListNode tail = null;
		
		while(!minHeap.isEmpty()) {
			ListNode temp = minHeap.poll();
			if(head == null) {
				head = tail = temp;
			}else {
				tail.next = temp;
				tail = tail.next;
			}
			if(temp.next != null) {
				minHeap.add(temp.next);
			}
		}
		
		System.out.println(head.toString());
		
	}

}
class ListNode{
	int value;
	ListNode next;
	
	public ListNode(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "ListNode [value=" + value + ", next=" + next + "]";
	}
	
	
}