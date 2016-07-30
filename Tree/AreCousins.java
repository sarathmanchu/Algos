package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by sarath on 7/28/16.
 */
public class AreCousins {
    boolean arecousins(Node root,int a,int b){
        if(a==b)
            return false;
        return (!areSiblings(root,a,b) && getLevel(root,a,1)==getLevel(root,b,1));
    }
    boolean areSiblings(Node root,int a ,int b){
        if(root==null)
            return false;
        return ((root.left.data==a && root.right.data==b)|| (root.left.data==b && root.right.data==a) || areSiblings(root.left,a,b)||areSiblings(root.right,a,b));
    }
    int getLevel(Node root,int a,int currLvl){
        if(root==null)
            return 0;
        if(root.data==a)
            return currLvl;
        int level=getLevel(root.left,a,currLvl+1);
        if(level!=0)
            return level;
        else
            return getLevel(root.right,a,currLvl+1);
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

        AreCousins ac=new AreCousins();
        System.out.println(ac.arecousins(root, 6, 4));
    }
}
