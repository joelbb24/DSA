package Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Node {
    int key;
    Node left;
    Node right;
    Node(int k)
    {
        key = k;
    }


    public void inorder(Node root) {
        if(root != null) {
            inorder(root.left);
            System.out.print(root.key+ " ");
            inorder(root.right);
        }
    }

    public void preorder(Node root) {
        if(root != null) {
            System.out.print(root.key + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    public void postorder(Node root){
        if(root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.key+ " ");
        }
    }

     public int height(Node root) {
        if( root == null) {
            return 0;
        }
        else
            return Math.max(height(root.left), height(root.right)) + 1;
     }

     public void printKDistance(Node root, int k) {
        if(root == null)
            return;
        if(k==0)
            System.out.print(root.key+" ");
        else
        {
            printKDistance(root.left, k-1);
            printKDistance(root.right, k-1);
        }
     }

     public void printLevel(Node root) {
        if(root == null)
            return;
         Queue<Node> q = new LinkedList<>();
         q.add(root);
         while(q.isEmpty() == false) {
             Node curr = q.poll();
             System.out.print(curr.key+" ");
             if(curr.left != null)
                 q.add(curr.left);
             if(curr.right != null)
                 q.add(curr.right);
         }
     }

     public void printLevelByLine(Node root) {
        if(root == null)
            return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while(q.size() > 1)
        {
            Node curr = q.poll();
            if(curr==null) {
                System.out.println();
                q.add(null);
                continue;
            }
            System.out.print(curr.key+" ");
            if(curr.left != null)
                q.add(curr.left);
            if(curr.right != null)
                q.add(curr.right);
        }
     }

     public int getSize(Node root) {
        if(root == null)
            return 0;
        else
            return 1 + getSize(root.left) + getSize(root.right);
     }
}

