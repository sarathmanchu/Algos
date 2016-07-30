package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by sarath on 7/28/16.
 */
public class SIzeOfBT {
    int sizeOfTree(Node root){
        if(root==null)
            return 0;
        int leftSize=sizeOfTree(root.left);
        int rightSize=sizeOfTree(root.right);
        return 1+leftSize+rightSize;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.left.left = new Node(8);
        root.left.left.right = new Node(9);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(new SIzeOfBT().sizeOfTree(root));
    }
}
