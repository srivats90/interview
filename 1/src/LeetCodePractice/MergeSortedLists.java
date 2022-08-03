package LeetCodePractice;

import java.util.*;

public class MergeSortedLists {

	public static void main(String[] args) {

		ListNode list1 = new ListNode(1);
		list1.next = new ListNode(2);
		list1.next.next = new ListNode(4);

		ListNode list2 = new ListNode(1);
		list2.next = new ListNode(3);
		list2.next.next = new ListNode(4);

		mergeList(list1, list2);

	}

	private static void mergeList(ListNode list1, ListNode list2) {

		PriorityQueue<ListNode> minHeap = new PriorityQueue<>((n1, n2) -> n1.getVal() - n2.getVal());

		List<Integer> list = new ArrayList<>();
		List<Integer> linked = new LinkedList<>();

		minHeap.add(list1);
		minHeap.add(list2);

		while (!minHeap.isEmpty()) {
			ListNode node = minHeap.poll();

			if (node.next != null)
				minHeap.offer(node.next);

			list.add(node.val);
			linked.add(node.val);
		}
		
		System.out.println(list.toString());
		System.out.println(linked.toString());

	}

}

class ListNode {

	int val;
	ListNode next;

	public ListNode(int val) {
		this.val = val;
		this.next = null;
	}

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}

	public ListNode getNext() {
		return next;
	}

	@Override
	public String toString() {
		return "ListNode [val=" + val + ", next=" + next + "]";
	}
	
	

}