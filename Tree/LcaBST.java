package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by sarath on 7/29/16.
 */
public class LcaBST {
    static int findLca(Node root,int a,int b){
        if(root==null)
            return -1;
        if(root.data>Math.max(a,b))
            return findLca(root.left,a,b);
        if(root.data<Math.min(a,b))
            return findLca(root.right,a,b);
        else
            return root.data;

    }
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(2);
        root.right = new Node(6);
        root.left.left = new Node(0);
        root.left.right = new Node(3);
        //root.left.left.left = new Node(8);
        //root.left.left.right = new Node(9);
        //root.left.right = new Node(5);
        //root.right.left = new Node(6);
        root.right.right = new Node(7);
        System.out.println(findLca(root, 6, 7));

    }
}
