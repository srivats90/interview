package leetcode;

public class DeleteDuplicates {

	public static ListNode deleteDuplicates(ListNode a) {
		
		ListNode b = new ListNode();
		ListNode head = new ListNode();
		head = b;
		b.value = a.value;
		b.next = a.next;
		while(a.next != null) {
			a = a.next;
			if(a.value != b.value) {
				b.next = a;
				b = b.next;
//				b.value = a.value;
			}
		}
		b.next = null;
		return head;
	}
	public static void main(String[] args) {
		
		ListNode a1 = new ListNode();
		ListNode a2 = new ListNode();
		ListNode a3 = new ListNode();
		ListNode a4 = new ListNode();
		ListNode a5 = new ListNode();
		
		a1.value = 1;
		a1.next = a2;
		a2.value = 1;
		a2.next = a3;
		a3.value = 2;
//		a3.next = null;
		a3.next = a4;
		a4.value = 3;
		a4.next = a5;
		a5.value = 3;
		a5.next = null;
		// TODO Auto-generated method stub
		ListNode output = DeleteDuplicates.deleteDuplicates(a1);
		
		while(output.next != null) {
			System.out.println(output.value);
			output = output.next;
		}
		System.out.println(output.value);

	}

}

//public ListNode deleteDuplicates(ListNode head) {
//    ListNode list = head;
//     
//     while(list != null) {
//    	 if (list.next == null) {
//    		 break;
//    	 }
//    	 if (list.val == list.next.val) {
//    		 list.next = list.next.next;
//    	 } else {
//    		 list = list.next;
//    	 }
//     }
//     
//     return head;
//}
