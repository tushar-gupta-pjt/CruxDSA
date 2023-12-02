package lecture_37;


public class Diameter_of_Binary_Tree {
	
	public class TreeNode {
		       int val;
		       TreeNode left;
		       TreeNode right;
		       TreeNode() {}
		       TreeNode(int val) { this.val = val; }
		       TreeNode(int val, TreeNode left, TreeNode right) {
		           this.val = val;
		           this.left = left;
		           this.right = right;
		       }
		       
	}
	
	
	class Solution {
	    public int diameterOfBinaryTree(TreeNode root) {
	    	
	    	return diameter(root);
	        
	    }
	    
		public int diameter(TreeNode root) {
			
			if(root == null){
				return 0;
			}
			int ld = diameter(root.left);
			int rd = diameter(root.left);
			int sd = height(root.left) + height(root.right) + 2;             // khud se paas hone wale ka diameter (khud ko root mannte hue)
			
			return Math.max(sd, Math.max(ld, rd));
	    }
		
		private int height(TreeNode nn) {
			// TODO Auto-generated method stub                               // here we have taken height of single node as zero!
			if(nn==null) {
				return -1;
			}
			
			int lh = height(nn.left);
			int rh = height(nn.right);
			 return Math.max(lh, rh)+ 1;
		}
	    
	    
	}
	
}
