package LinkedList;

public class InPlaceReverse {
	static class ListNode{
		int value;
		ListNode next;
		
		ListNode(){
			this.value = -1;
			this.next = null;
		}
		ListNode(int value){
			this.value = value;
			this.next = null;
		}
		@Override
		public String toString() {
			return "ListNode [value=" + value + ", next=" + next + "]";
		}
		
		
	}
	public static void main(String[] args) {
		
		ListNode head = new ListNode();
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(5);

		ListNode current = head;
		ListNode next = null;
		ListNode prev = null;
		
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		
		System.out.println(prev);
	}

}
