package com.example.helloworld.producerconsumer.Tree;

import com.example.helloworld.producerconsumer.Arrays.HeapSort;

/**
 * Created by sarath on 7/28/16.
 */
public class HeightOfBT {
    int heightOfTree(Node root){
        if(root==null)
            return 0;
        int leftHeight=heightOfTree(root.left);
        int rightHeight=heightOfTree(root.right);
        return 1+Math.max(leftHeight,rightHeight);
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
        HeightOfBT heightOfBT=new HeightOfBT();
        System.out.println(heightOfBT.heightOfTree(root));
    }
}
