package LeetCodePractice;


public class SwapNodesInPairs {

	public static void main(String[] args) {
		
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		
		swapNodes(head);
	}

	private static void swapNodes(ListNode head) {
		
		int count = 0;
		ListNode temp = head;
		ListNode prev = null;
		
		while(temp!=null) {
			if(count == 2)
				count = 0;
			
			if(count == 0) {
				prev = temp;
			}
			if(count == 1) {
				prev.next = temp.next;
				temp = prev;
			}
			count++;
		}
		
		System.out.println(head.toString());
		
	}

}
