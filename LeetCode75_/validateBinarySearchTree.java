/*
Given the root of a binary tree, determine if it is a valid binary search tree (BST).

A valid BST is defined as follows:

The left 
subtree
 of a node contains only nodes with keys less than the node's key.
The right subtree of a node contains only nodes with keys greater than the node's key.
Both the left and right subtrees must also be binary search trees.

*/

public boolean isValidBST(TreeNode root) {
        Stack<TreeNode> stack=new Stack();
        TreeNode prev=null;
        while(!stack.isEmpty() || root!=null){
            while(root!=null){
                stack.push(root);
                root=root.left;
            }
            root=stack.pop();
            if(prev!=null && prev.val>=root.val){
                return false;
            }
            prev=root;
            root=root.right;
        }



            return true;

    }