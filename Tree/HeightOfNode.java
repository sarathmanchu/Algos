package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by sarath on 7/29/16.
 */
public class HeightOfNode {
    static int heightOfNode(Node root,int level,int val){
        if(root==null)
            return 0;
        if(root.data==val)
            return level;
        level=heightOfNode(root.left,level+1,val);
        level=heightOfNode(root.right,level+1,val);
        return level;
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
        System.out.println(heightOfNode(root,0,9));
    }
}
