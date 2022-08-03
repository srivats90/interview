package leetCodeIntermediate;

public class ConvertArrayToBST {

	static class TreeNode{
		int value;
		TreeNode left;
		TreeNode right;
		
		TreeNode(int value){
			this.value = value;
			this.left = null;
			this.right = null;
		}

		@Override
		public String toString() {
			return "TreeNode [value=" + value + ", left=" + left + ", right=" + right + "]";
		}
		
		
	}
	
	public static void main(String[] args) {
		
		int[] arr = {-10,-3,0,5,9};
		
		TreeNode head = constructBST(arr, 0 , arr.length-1);
		
		System.out.println(head.toString());

	}

	private static TreeNode constructBST(int[] arr, int low, int high) {
		
		if(low > high) {
			return null;
		}
		
		int mid = low + (high-low+1)/2;
		TreeNode m = new TreeNode(arr[mid]);
		
		m.left = constructBST(arr, low, mid-1);
		m.right = constructBST(arr, mid+1, high);
		
		return m;
	}

}
