package BinaryTree;

import java.util.*;

public class LevelOrderTraversal {

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
		
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);
		
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(7);
		
		levelOrder(root);

	}

	private static void levelOrder(TreeNode root) {
		
		List<Integer> list = new ArrayList<>();
		
		Queue<TreeNode> queue = new LinkedList<>();
		
		queue.offer(root);
		int levelSize = 0;
		while(!queue.isEmpty()) {
			levelSize = queue.size();
			
			while(levelSize !=0) {
				levelSize--;
				TreeNode node = queue.poll();
				list.add(node.value);
				if(node.left != null) {
					queue.add(node.left);
				}
				if(node.right !=null) {
					queue.add(node.right);
				}
			}
		}
		
		System.out.println(list.toString());
	}

}
