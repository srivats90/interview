package practice;

import java.util.*;

public class BSTLevelOrder {

	public static void main(String[] args) {
		TreeNode a = new TreeNode(15);
		TreeNode b = new TreeNode(7);
		TreeNode c = new TreeNode(9);
		TreeNode d = new TreeNode(20,a,b);
		TreeNode root = new TreeNode(3, c, d);

		levelOrder(root);
	}

	private static void levelOrder(TreeNode root) {
		
		Queue<TreeNode> queue = new LinkedList<>();
		List<Integer> list = new ArrayList<>();
		
		queue.offer(root);
		
		while(!queue.isEmpty()) {
			int size = queue.size();
			
			while(size != 0) {
				TreeNode node = queue.poll();
				list.add(node.value);
				if(node.left != null)
					queue.add(node.left);
				if(node.right != null)
					queue.add(node.right);
				
				size--;
			}
		}
		
		System.out.println(list.toString());
		
	}

}
