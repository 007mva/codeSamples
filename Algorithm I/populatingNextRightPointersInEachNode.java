/*
You are given a perfect binary tree where all leaves are on the same level, 
and every parent has two children. The binary tree has the following definition:

struct Node {
  int val;
  Node *left;
  Node *right;
  Node *next;
}
Populate each next pointer to point to its next right node. If there is no next right node, the next pointer should be set to NULL.

Initially, all next pointers are set to NULL.

*/

 public Node connect(Node root) {
        if(root==null) return null;
        Queue<Node> q= new LinkedList();
        q.offer(root);
        int size=0;
        while(!q.isEmpty()){
                size=q.size();
                for(int i=0;i<size;i++){
                    Node temp=q.poll();
                    if(i<size-1){
                        temp.next=q.peek();
                    }
                    if(temp.left!=null){
                        q.offer(temp.left);
                    }
                    if(temp.right!=null){
                        q.offer(temp.right);
                    }
                }
        }

            return root;
    }