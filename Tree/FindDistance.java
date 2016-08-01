package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by h128850 on 7/31/16.
 */

public class FindDistance {

    static Node findLCA(Node root,int a,int b){
        if(root==null)
            return null;
        if(root.data==a || root.data==b)
            return root;
        Node left=findLCA(root.left,a,b);
        Node right=findLCA(root.right,a,b);
        if(left!=null && right!=null)
            return root;
        return left!=null?left:right;
    }

    static int pathLength(Node root,int a){
        if(root==null)
            return 0;
        int x=0;
        if(root.data==a || (x=pathLength(root.left,a))>0 ||(x=pathLength(root.right,a))>0)
            x=x+1;
        return x;
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

        int a=25,b=30;
        int x= pathLength(root,a);
        System.out.println("x is "+x);
        int y=pathLength(root,b);
        System.out.println("y is "+y);
        int lca=findLCA(root,a,b).data;
        System.out.println(lca);

        int l=pathLength(root,lca);
        System.out.println((x+y)-(2*l));


    }
}
