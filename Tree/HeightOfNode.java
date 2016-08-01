package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by sarath on 7/29/16.
 */
public class HeightOfNode {
    static int heightOfNode(Node root,int level,int val){
        if(root==null)
            return -1;
        if(root.data==val)
            return level;
        level++;
        int leftLevel=heightOfNode(root.left,level,val);
        int rightLevel=heightOfNode(root.right,level,val);
       /* if(leftLevel!=-1 && rightLevel!=-1)
            return level;*/
        return leftLevel==-1 ? rightLevel:leftLevel;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
       // root.left.left = new Node(4);
      //  root.left.left.left = new Node(8);
       // root.left.left.right = new Node(9);
       // root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
        root.right.right.left = new Node(10);
        System.out.println(heightOfNode(root,0,6));
    }
}
