package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by sarath on 7/28/16.
 */
public class isBST {
    boolean isBST(Node root,int min,int max){
        if(root==null)
            return true;
        if(root.data<min || root.data>=max){
            return false;
        }
        return isBST(root.left,min,root.data) && isBST(root.right,root.data,max);
    }
    public static void main(String[] args) {
        Node root=new Node(4);
        root.left=new Node(2);
        root.right=new Node(5);
       root.left.left=new Node(1);
        /*root.left.right=new Node(2);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.left.left.right=new Node(8);*/
        isBST isBST=new isBST();
        System.out.println(isBST.isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
    }
}
