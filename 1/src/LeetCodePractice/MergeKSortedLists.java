package LeetCodePractice;

import java.util.*;
public class MergeKSortedLists {

	public static void main(String[] args) {
		
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(5);
		
		ListNode l2 = new ListNode(1);
		l2.next = new ListNode(3);
		l2.next.next = new ListNode(4);
		
		ListNode l3 = new ListNode(2);
		l3.next = new ListNode(6);
		
		List<ListNode> list = new ArrayList<>();
		list.add(l1);
		list.add(l2);
		list.add(l3);
		
		mergeKSorted(list);

	}

	private static void mergeKSorted(List<ListNode> list) {
		
		PriorityQueue<ListNode> minHeap = new PriorityQueue<>((n1, n2) -> n1.getVal() - n2.getVal());
		
		List<Integer> ans = new LinkedList<>();
		//minHeap.addAll(list);
		for(ListNode node : list) {
			minHeap.add(node);
		}
	//	System.out.println(minHeap.toString());
		
		while(!minHeap.isEmpty()) {
			ListNode node = minHeap.poll();
			
			if(node.next != null)
				minHeap.offer(node.next);
			
			ans.add(node.val);
		}
		
		System.out.println(ans.toString());
	}

}

