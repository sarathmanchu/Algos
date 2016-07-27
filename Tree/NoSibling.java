package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by sarath on 7/27/16.
 */
public class NoSibling {
    static void noSibling(Node root){
        if(root.left==null && root.right!=null)
            System.out.println(root.right.data);
        if(root.right==null && root.left!=null)
            System.out.println(root.left.data);
        if(root.left!=null)
        noSibling(root.left);
        if(root.right!=null)
            noSibling(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(10);
        root.right = new Node(15);
        root.left.left = new Node(20);
        //root.left.right = new Node(25);
        root.right.left = new Node(30);
        //root.right.right = new Node(35);
        root.left.left.left = new Node(45);
        noSibling(root);
    }
}
