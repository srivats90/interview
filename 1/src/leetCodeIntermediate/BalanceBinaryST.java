package leetCodeIntermediate;

import java.util.*;

public class BalanceBinaryST {

	static class TreeNode {
		int value;
		TreeNode left;
		TreeNode right;

		TreeNode(int value) {
			this.value = value;
			this.left = null;
			this.right = null;
		}

		@Override
		public String toString() {
			return "TreeNode [value=" + value + ", left=" + left + ", right=" + right + "]";
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.right = new TreeNode(3);
		root.right.right.right = new TreeNode(4);

		List<Integer> list = new ArrayList<>();

		inorder(root, list);
		
		System.out.println(list.toString());

		TreeNode newRoot = balanceIt(list, 0, list.size() - 1);

		System.out.println(newRoot.toString());

	}

	private static TreeNode balanceIt(List<Integer> list, int low, int high) {

		if (low > high)
			return null;

		int mid = (high - low + 1) / 2 + low;
		TreeNode node = new TreeNode(list.get(mid));

		node.left = balanceIt(list, low, mid - 1);
		node.right = balanceIt(list, mid + 1, high);

		return node;

	}

	private static void inorder(TreeNode root, List<Integer> list) {

		if (root == null)
			return;

		inorder(root.left, list);
		list.add(root.value);
		inorder(root.right, list);

	}

}
