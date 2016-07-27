package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by sarath on 7/27/16.
 */
public class LeftView {
    static int currLevel=0;
    static void printLeftView(Node root,int nextLevel){
        if(root==null)
            return;
        if(currLevel<nextLevel){
            System.out.println(root.data);
            currLevel=nextLevel;
        }
        printLeftView(root.left,nextLevel+1);
        printLeftView(root.right,nextLevel+1);
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
        printLeftView(root,1);
    }
}
