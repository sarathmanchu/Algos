package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by sarath on 7/27/16.
 */
public class RightView {
    static int maxLevel=0;
    static void printRightView(Node root,int currLevel){
        if(root==null)return;
        if(maxLevel<currLevel) {
            System.out.println(root.data);
            maxLevel = currLevel;
        }
            printRightView(root.right,currLevel+1);
            printRightView(root.left,currLevel+1);
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
        printRightView(root,1);
    }
}
