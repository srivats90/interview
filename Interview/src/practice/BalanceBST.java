package practice;
import java.util.*;

public class BalanceBST {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.right = new TreeNode(3);
		root.right.right.right = new TreeNode(4);
		
		List<Integer> list = new ArrayList<>();
		
		inorder(list, root);
		System.out.println(list.toString());
		
		System.out.println(balanceit(list, 0, list.size() -1).toString() );
	}

	

	private static TreeNode balanceit(List<Integer> list, int low, int high) {
		
		if(low > high)
			return null;
		
		int mid = low + (high-low+1)/2;
		TreeNode root = new TreeNode(list.get(mid));
		
		root.left = balanceit(list, low, mid-1);
		root.right = balanceit(list , mid+1, high);
		
		return root;
	}



	private static void inorder(List<Integer> list, TreeNode root) {
		if(root == null)
			return;
		
		inorder(list, root.left);
		list.add(root.value);
		inorder(list, root.right);
		
	}

}
class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int value) {
		this.value = value;
		this.left = null;
		this.right = null;
	}
	
	public TreeNode(int val, TreeNode left, TreeNode right) {
		super();
		this.value = val;
		this.left = left;
		this.right = right;
	}

	@Override
	public String toString() {
		return "TreeNode [value=" + value + ", left=" + left + ", right=" + right + "]";
	}
	
}