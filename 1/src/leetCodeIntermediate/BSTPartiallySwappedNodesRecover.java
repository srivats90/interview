package leetCodeIntermediate;

import java.util.*;
public class BSTPartiallySwappedNodesRecover {

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
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(3);
		root.left.right = new TreeNode(2);
		
		System.out.println(root.toString());
		
		List<Integer> nums = new ArrayList<>();
		
		inorder(root, nums);
		
		int[] swappedNos = findSwapped(nums);
		
		swapNodes(root, 2, swappedNos[0], swappedNos[1]);
		
		System.out.println(root.toString());

	}

	private static void swapNodes(TreeNode root, int count, int x, int y) {
		
		if(root == null)
			return;
		else {
			if(root.value == x || root.value == y) {
				if(root.value == x)
					root.value = y;
				else
					root.value = x;
				count--;
				if(count == 0) {
					return;
				}
			}
			swapNodes(root.left, count, x, y);
			swapNodes(root.right, count, x, y);
		}
		
	}

	private static int[] findSwapped(List<Integer> nums) {
		
		int x = -1, y = -1;
		
		for(int i= 0; i < nums.size() -1; i++) {
			if(nums.get(i+1) < nums.get(i)) {
				y = nums.get(i+1);
				x = nums.get(i);
				break;
			}
		}
		
		return new int[] {x,y};
	}

	private static void inorder(TreeNode root, List<Integer> nums) {
		
		if(root == null)
			return;
		
		inorder(root.left, nums);
		nums.add(root.value);
		inorder(root.right, nums);
		
	}

}
