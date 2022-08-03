package leetCodeIntermediate;

import java.util.*;
public class UniqueBSTforN {

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
		
		int n = 3;
		//1 is the start
		LinkedList<TreeNode> root = uniqueBSTs(1, n);
		System.out.println(root.toString());

	}

	private static LinkedList<TreeNode> uniqueBSTs(int start,int end) {
		
		LinkedList<TreeNode> fullList = new LinkedList<>();
		
		if(start>end) {
			fullList.add(null);
			return fullList;
		}
		
		for(int i=start; i<=end; i++) {
			
			LinkedList<TreeNode> leftList = uniqueBSTs(start, i-1);
			LinkedList<TreeNode> rightList = uniqueBSTs(i+1, end);
			
			for(TreeNode left : leftList) {
				for(TreeNode right : rightList) {
					TreeNode node = new TreeNode(i);
					node.left = left;
					node.right = right;
					fullList.add(node);
				}
			}
		}
		
		return fullList;
	}


}
