package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by sarath on 7/27/16.
 */
public class DeepestOddLeaf {
    static int oddLevelDeepestNode(Node root,int currLevel){
        if(root==null)
            return 0;
        if(root.left==null && root.right==null && (currLevel&1)!=0)
            return currLevel;
        return Math.max(oddLevelDeepestNode(root.left,currLevel+1),oddLevelDeepestNode(root.right,currLevel+1));

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
        //root.left.left.left.left.left = new Node(46);
        //root.left.left.left.left.left.left = new Node(46);
        System.out.println(oddLevelDeepestNode(root,1));
    }
}
