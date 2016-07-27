package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by sarath on 7/27/16.
 */
public class ChildSum {
    int sum=0;
    public int allChildSum(Node root){
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            sum+=root.data;
        else
        {
            allChildSum(root.left);
            allChildSum(root.right);
        }
        return sum;
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
        System.out.println(new ChildSum().allChildSum(root));
    }
}
