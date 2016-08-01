package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by h128850 on 7/30/16.
 */

public class IsSymmetric {
    static boolean isSymmetric(Node root1,Node root2){
        if(root1==null && root2==null)
            return true;
        if(root1==null || root2==null)
            return false;
        if(root1.data==root2.data){
            if(isSymmetric(root1.left,root2.right))
                return isSymmetric(root1.right,root2.left);
        }
        return false;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(5);
        root.right.right = new Node(4);
        root.left.left.right = new Node(6);
        root.right.right.left=new Node(6);
        System.out.println(isSymmetric(root,root));
    }
}
