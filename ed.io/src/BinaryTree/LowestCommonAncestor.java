package BinaryTree;

public class LowestCommonAncestor {

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(5);
		root.right = new TreeNode(1);
		root.left.left = new TreeNode(6);
		root.left.right = new TreeNode(2);
		root.left.right.left = new TreeNode(7);
		root.left.right.right = new TreeNode(4);
		
		root.right.left = new TreeNode(0);
		root.right.right = new TreeNode(8);
		
		TreeNode p = new TreeNode(4);
		TreeNode q = new TreeNode(7);
		
		TreeNode result = lowestCommon(root, p ,q );
		
		System.out.println(result.val);

	}

	private static TreeNode lowestCommon(TreeNode root, TreeNode p, TreeNode q) {
		
		if(root == null)
			return root;
		
		//one of the nodes have been found.
		if(root.val == p.val || root.val == q.val)
			return root;
		
		TreeNode left = lowestCommon(root.left, p, q);
		TreeNode right = lowestCommon(root.right, p ,q);
		
		//im the LCA because both have found and returned a non-null value
		if(left != null && right!= null)
			return root;
		
		//if matched return it or else return null
		return left!=null ? left : right;
	}

}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int val) {
		this.val = val;
		this.left = null;
		this.right = null;
	}
}
