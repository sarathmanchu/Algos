package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by h128850 on 7/8/16.
 */
public class LCATree {
    Node lca(Node root,int n1,int n2){
        if(root==null)
            return null;
        if(root.data==n1|| root.data==n2)
            return root;
        Node left=lca(root.left,n1,n2);
        Node right=lca(root.right,n1,n2);
        if(left!=null && right!=null)
            return root;
        return left!=null?left:right;
    }
    Node lcsBST(Node root,int n1,int n2){
        if(root==null)
            return null;
        if(root.data>Math.max(n1,n2))
            return lcsBST(root.left,n1,n2);
        else if(root.data<Math.min(n1,n2))
            return lcsBST(root.right,n1,n2);
        else
            return root;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.left.left = new Node(4);
        root.left.right.left = new Node(7);
        root.left.left.left =new Node(6);
        root.left.right.left.left = new Node(8);
        root.left.right.left.left.right = new Node(9);
        LCATree lcaTree=new LCATree();

        System.out.println(lcaTree.lca(root, 5, 9).data);
    }

}
