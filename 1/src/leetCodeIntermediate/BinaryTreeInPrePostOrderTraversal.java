package leetCodeIntermediate;

public class BinaryTreeInPrePostOrderTraversal {
	
	 static class TreeNode{
			char value;
			TreeNode left;
			TreeNode right;
			
			TreeNode(char value){
				this.value = value;
				this.left = null;
				this.right = null;
			}
		}

	 public static void inOrder(TreeNode root) {
		 
		 if(root == null)
			 return;
		 
		 inOrder(root.left);
		 System.out.println(root.value);
		 inOrder(root.right);
		 
	 }
	 
	 public static void preOrder(TreeNode root) {
		 if(root == null)
			 return;
		 
		 System.out.println(root.value);
		 preOrder(root.left);
		 preOrder(root.right);
	 }
	 
	 public static void postOrder(TreeNode root) {
		 if(root == null)
			 return;
		 
		 postOrder(root.left);
		 postOrder(root.right);
		 System.out.println(root.value);
	 }
	 
	 public static void levelOrder(TreeNode root) {
		 for(int i = 0; i <= 3; i++) {
			 printLevel(root, i);
		 }
	 }
	 
	private static void printLevel(TreeNode root, int level) {
		
		if(root == null)
			return;
		if(level == 0)
			System.out.println(root.value);
		else if(level > 0) {
			printLevel(root.left , level -1);
			printLevel(root.right, level -1);
		}
	}

	public static void main(String[] args) {
		
		TreeNode root = new TreeNode('A');
		root.left = new TreeNode('D');
		root.left.left = new TreeNode('H');
		root.left.left.left = new TreeNode('K');
		
		root.left.right = new TreeNode('L');
		root.left.right.right = new TreeNode('P');
		
		root.right = new TreeNode('Z');
		root.right.left = new TreeNode('B');
		root.right.right = new TreeNode('C');
		root.right.right.right = new TreeNode('E');
		
//		inOrder(root);
//		preOrder(root);
//		postOrder(root);
		levelOrder(root);

	}

}

