package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by Sarath on 7/9/16.
 */
public class IsBST {

    private boolean isBST(Node root,int min,int max){
        if(root==null)
            return true;
        if(root.data<=min || root.data>max)
            return false;
        return isBST(root.left,min,root.data)&&isBST(root.right,root.data,max);
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.left.left = new Node(4);
        root.left.right.left = new Node(3);
        root.left.left.left =new Node(6);
        root.left.right.left.left = new Node(1);
        root.left.right.left.left.right = new Node(2);
        System.out.println(new IsBST().isBST(root.left.right,Integer.MIN_VALUE,Integer.MAX_VALUE));
    }
}
