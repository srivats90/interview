package leetCodeIntermediate;

import java.util.*;

public class BinarySearchLevelOrderTraversal {

	public static void BSTLOT(TreeNode root) {
		
		List<List<Integer>> list = new ArrayList<>();
		
		Queue<TreeNode> q = new LinkedList<>();

		q.offer(root);
		
		while(!q.isEmpty()) {
			
			int levelSize = q.size();
			List<Integer> currentLevel = new ArrayList<>();
			for(int i =0; i< levelSize ; i++) {
				TreeNode currentNode = q.poll();
				currentLevel.add(currentNode.val);
				
				if(currentNode.left != null)
					q.offer(currentNode.left);
				if(currentNode.right != null)
					q.offer(currentNode.right);
				
			}
			list.add(currentLevel);
		}
		System.out.println(list.toString());
	}
	
	public static void main(String[] args) {
		
		TreeNode a = new TreeNode(15);
		TreeNode b = new TreeNode(7);
		TreeNode c = new TreeNode(9);
		TreeNode d = new TreeNode(20,a,b);
		TreeNode root = new TreeNode(3, c, d);

		BSTLOT(root);
	}

}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int val) {
		super();
		this.val = val;
		this.left = null;
		this.right = null;
	}

	public TreeNode(int val, TreeNode left, TreeNode right) {
		super();
		this.val = val;
		this.left = left;
		this.right = right;
	}
	
}