package leetCodeIntermediate;

import java.util.*;
public class BSTKthSmallest {

	static class TreeNode{
		int value;
		TreeNode left;
		TreeNode right;
		TreeNode(int value){
			this.value = value;
			this.left = null;
			this.right = null;
		}
	}
	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(1);
		root.left.right = new TreeNode(2);
		root.right = new TreeNode(4);

		List<Integer> inOrderList = new ArrayList<>();
		inorder(root, inOrderList);
		
		inOrderList.forEach(s -> System.out.println(s));
		
		System.out.println(inOrderList.get(1-1));
	}
	private static void inorder(TreeNode root, List<Integer> inOrderList) {
		
		if(root == null)
			return;
		
		inorder(root.left, inOrderList);
		inOrderList.add(root.value);
		inorder(root.right , inOrderList);
		
	}

}
