package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by h128850 on 7/8/16.
 */
public class HeightOfBTree {

    int height(Node root){
        if(root==null)
            return 0;
        return Math.max(height(root.left),height(root.right))+1;
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.right = new Node(5);
        root.left.left = new Node(4);
        root.left.right.left = new Node(7);
        root.left.left.left =new Node(6);
        root.left.right.left.left = new Node(8);
        root.left.right.left.left.right = new Node(9);
        HeightOfBTree heightOfBTree=new HeightOfBTree();
        System.out.println(heightOfBTree.height(root));
    }
}
class Node{
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        this.left=null;
        this.right=null;
    }
}