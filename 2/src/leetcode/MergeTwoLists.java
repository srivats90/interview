package leetcode;

public class MergeTwoLists {
	
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		if(l1 == null) return l2;
		if(l2 == null) return l1;
		if(l1.value < l2.value){
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
	}
	public static void main(String[] args) {
		
		ListNode a3 = new ListNode();
		ListNode a2 = new ListNode();
		ListNode a1 = new ListNode();
		
		ListNode b1 = new ListNode();
		ListNode b2 = new ListNode();
		ListNode b3 = new ListNode();
		
		a1.value = 1; a1.next = a2;
		a2.value = 2; a2.next = a3;
		a3.value = 4; a3.next = null;
		
		b1.value = 1; b1.next = b2;
		b2.value = 3; b2.next = b3;
		b3.value = 5; b3.next = null;
		
		ListNode l3 = MergeTwoLists.mergeTwoLists(a1, b1);
		
		do{
			System.out.println(l3.value);
			l3 = l3.next;
		}while(l3.next != null);
		System.out.println(l3.value);

	}

}
