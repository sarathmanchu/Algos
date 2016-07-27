package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by sarath on 7/27/16.
 */
public class MinHeight {
    static int getMinHeight(Node root){
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        int leftHeight=root.left!=null ? getMinHeight(root.left):Integer.MAX_VALUE;
        int rightHeight=root.right!=null ?getMinHeight(root.right):Integer.MAX_VALUE;
        return 1+Math.min(leftHeight,rightHeight);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.left.left.right=new Node(8);
        System.out.println(getMinHeight(root));
    }
}
