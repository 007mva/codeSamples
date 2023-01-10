/*
Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between 
two nodes p and q as the lowest node in 
T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

*/
public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        int pv=p.val;
        int qv=q.val;

        while(root!=null){
           TreeNode parentNode=root;
           if(pv>parentNode.val && qv>parentNode.val){
               root=root.right;
           }
           else if(pv<parentNode.val && qv<parentNode.val){
               root=root.left;
           }
           else {
               return parentNode;
           }
        }
        return null;
    }