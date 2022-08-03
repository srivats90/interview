package leetcode;

public class Rotate {

	//SOLUTIONS:
	public static ListNode rotateRight(ListNode head, int n) {

	if (head==null||head.next==null) return head;
    ListNode dummy=new ListNode(0);
    dummy.next=head;
    ListNode fast=dummy,slow=dummy;

    int i;
    for (i=0;fast.next!=null;i++)//Get the total length 
    	fast=fast.next;
    
    for (int j=i-n%i;j>0;j--) //Get the i-n%i th node
    	slow=slow.next;
    
    fast.next=dummy.next; //Do the rotation
    dummy.next=slow.next;
    slow.next=null;
    
    return dummy.next;
	}
	
	public static void main(String[] args) {
		ListNode a = new ListNode(1);
		ListNode b = new ListNode(2);
		ListNode c = new ListNode(3);
		ListNode d = new ListNode(4);
		ListNode e = new ListNode(5);

		a.next = b;
		b.next = c;
		c.next = d;
		d.next = e;
		e.next = null;

		rotateRight(a, 2);
//		int k = 2;
//		
//		ListNode head = new ListNode(0, a);
//		ListNode current = head;
//		ListNode temp = null;
//		
//        while( current.next != null & k !=0) {
//        	current = current.next;
//        	
//        	if(current.next.next == null) {
//        		current.next.next = head.next;
//        		head.next = current.next;
//        		current.next = null;
//        		k--;
//        	}    	
//        }
//		
//        ListNode rotated = head;
//        
//        while(rotated.next != null) {
//        	System.out.println(rotated.value);
//        	rotated = rotated.next;
//        }
	}

}
