/*
Given the root of a binary tree, return the level order traversal of its nodes' values.
 (i.e., from left to right, level by level).

*/
public List<List<Integer>> levelOrder(TreeNode root) {
      
      List<List<Integer>> ll=new ArrayList();
      if(root==null) return ll;
      int size=0;
      Queue<TreeNode> q=new LinkedList();
      q.offer(root);
      while(!q.isEmpty()){
         size=q.size();
         List<Integer> l=new ArrayList();
         for(int i=0;i<size;i++){
            TreeNode temp=q.poll();
            l.add(temp.val);
            if(temp.left!=null) q.offer(temp.left);
            if(temp.right!=null) q.offer(temp.right);
         }

         ll.add(l);
      }

         return ll;
    } 