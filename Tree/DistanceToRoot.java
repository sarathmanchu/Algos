package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by h128850 on 7/31/16.
 */

public class DistanceToRoot {

    static int pathLength(Node root,int n1){
            if(root==null)
                return 0;
            int x=0;
            if((x=pathLength(root.left,n1))>0 || (x=pathLength(root.right,n1))>0 || (root.data==n1)){
                return x+1;
            }
            return 0;
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
        System.out.println(pathLength(root,15));
    }
}
