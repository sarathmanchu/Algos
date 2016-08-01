package com.example.helloworld.producerconsumer.Tree;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by h128850 on 7/31/16.
 */

public class PrintPathRootToNode {
    static ArrayList<Integer> path;
    static public boolean path(Node root,int val){
        if(root==null)
            return false;
        if(root.data==val || path(root.left,val)||path(root.right,val)) {
            path.add(root.data);
            return true;
        }
        return false;
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

        path(root,45);
        System.out.println(Arrays.toString(path.toArray()));
    }
}
