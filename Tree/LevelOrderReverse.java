package com.example.helloworld.producerconsumer.Tree;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by sarath on 7/28/16.
 */
public class LevelOrderReverse {
    void printLevelOrderRev(Node root){
        Queue<Node> queue=new LinkedList<>();
        Stack<Integer> stack=new Stack<>();
        queue.add(root);
        while (!queue.isEmpty()){
            Node current=queue.poll();
            if(current.right!=null)
                queue.add(current.right);
            if(current.left!=null)
                queue.add(current.left);
            stack.push(current.data);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.left.left.right=new Node(8);
        LevelOrderReverse levelOrderReverse=new LevelOrderReverse();
        levelOrderReverse.printLevelOrderRev(root);
    }
}
