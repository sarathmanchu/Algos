package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by sarath on 7/27/16.
 */
public class CheckCompleteBT {
    static boolean isComplete(Node root){
        if(root==null)
            return true;
        if(root.left==null && root.right==null)
            return true;
        if(root.left!=null && root.right!=null)
            return isComplete(root.left) && isComplete(root.right);
        return false;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        //root.right.left=new Node(6);
        root.right.right=new Node(7);
        //root.left.left.right=new Node(8);
        System.out.println(isComplete(root));
    }
}
