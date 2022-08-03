package FastPointers;

public class LoopDetection {

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
		
	}
	public static void main(String[] args) {
		
		ListNode head = new ListNode();
		head.next = new ListNode(1);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(3);
		head.next.next.next.next = new ListNode(4);
		head.next.next.next.next.next = new ListNode(5);
		
		ListNode sp = head.next;
		ListNode fp = head.next;
		
		while(fp.next != null && sp.next !=null) {
			fp = fp.next.next;
			sp = sp.next;
			
			if(fp.value == sp.value) {
				System.out.println("Cycle exists");
				break;
			}
		}

	}

}
