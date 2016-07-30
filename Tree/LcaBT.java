package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by sarath on 7/29/16.
 */
public class LcaBT {
    static Integer findLca(Node root,int a,int b){
        if(root==null)
            return null;
        if(root.data==a || root.data==b)
            return root.data;
        Integer left=findLca(root.left,a,b);
        Integer right=findLca(root.right,a,b);
        if(left!=null && right!=null)
            return root.data;
        return left==null ? right:left;
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
        System.out.println(findLca(root,4,7));
    }
}
