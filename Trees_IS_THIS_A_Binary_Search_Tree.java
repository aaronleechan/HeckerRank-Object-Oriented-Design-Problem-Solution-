package ObjectOrientedProgramming;

public class Trees_IS_THIS_A_Binary_Search_Tree {
	
	
	/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  


	The Node class is defined as follows:
	*/
	    class Node {
	        int data;
	        Node left;
	        Node right;
	     }
	
	    boolean checkBST(Node root) {
	       
	        return helper(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
	    }

	    boolean helper(Node node,int min, int max){
	     
	        /* an empty tree is BST */
	        if (node == null)
	            return true;
	 
	        /* false if this node violates the min/max constraints */
	        if (node.data < min || node.data > max)
	            return false;
	 
	        /* otherwise check the subtrees recursively
	        tightening the min/max constraints */
	        // Allow only distinct values
	        
	        return (helper(node.left, min, node.data-1) &&
	                helper(node.right, node.data+1, max));
	    }
	

}
