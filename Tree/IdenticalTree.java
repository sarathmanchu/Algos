package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by sarath on 7/27/16.
 */
public class IdenticalTree {
    static boolean areIdentical(Node root1,Node root2){
        if(root1==null && root2==null)
            return true;
        if(root1!=null && root2!=null){
            return (root1.data==root2.data && areIdentical(root1.left,root2.left)&& areIdentical(root1.right,root2.right));
        }
        return false;
    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(10);
        root.right = new Node(15);
        root.left.left = new Node(20);
        root.left.right = new Node(25);
        root.right.left = new Node(30);
        root.right.right = new Node(35);
        root.left.left.left = new Node(45);
        root.left.left.left.left = new Node(46);

        Node root1 = new Node(5);
        root1.left = new Node(10);
        root1.right = new Node(15);
        root1.left.left = new Node(20);
        root1.left.right = new Node(25);
        root1.right.left = new Node(30);
        root1.right.right = new Node(35);
        root1.left.left.left = new Node(45);
        root1.left.left.left.left = new Node(46);
        System.out.println(areIdentical(root,root1));
    }
}
