package com.example.helloworld.producerconsumer.Tree;

import java.util.Stack;

/**
 * Created by sarath on 7/27/16.
 */
public class PreOrderItr {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.left.left.right=new Node(8);
       // preOrderItr(root);
        //postOrderItr(root);
        inOrderItr(root);
    }

    private static void preOrderItr(Node root) {
        Stack<Node> st=new Stack<>();
        st.push(root);
        while (!st.isEmpty()){
            Node n=st.pop();
            System.out.println(n.data);
            if(n.right!=null)
                st.push(n.right);
            if(n.left!=null)
                st.push(n.left);
        }
    }
    static void postOrderItr(Node root){
        Stack<Node> st1=new Stack<>();
        Stack<Node> st2=new Stack<>();
        st2.push(root);
        while (!st2.isEmpty()){
            root=st2.pop();
            st1.push(root);
            if(root.left!=null)
                st2.push(root.left);
            if(root.right!=null)
                st2.push(root.right);
        }
        while (!st1.isEmpty()){
            System.out.println(st1.pop().data);
        }

    }
    static void inOrderItr(Node root){
        Stack<Node> stack=new Stack<>();
        while (root!=null){
            stack.push(root);
            root=root.left;
        }
        while (!stack.isEmpty()){
            root=stack.pop();
            System.out.println(root.data);
            if(root.right!=null){
                root=root.right;

                while (root!=null){
                    stack.push(root);
                    root=root.left;
                }
            }
        }
    }
}
