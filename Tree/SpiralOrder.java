package com.example.helloworld.producerconsumer.Tree;

import android.util.StringBuilderPrinter;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by sarath on 7/28/16.
 */
public class SpiralOrder {
    void printSpiral(Node root){
        Stack<Node> leftStack=new Stack<>();
        Stack<Node> rightStack=new Stack<>();
        leftStack.push(root);
        while (!leftStack.isEmpty() && rightStack.isEmpty()){
            while (!leftStack.isEmpty()){
                Node current=leftStack.pop();
                if(current.left!=null)
                    rightStack.push(current.left);
                if(current.right!=null)
                    rightStack.push(current.right);
                System.out.print(current.data+" ");
            }
            System.out.println();
            while (!rightStack.isEmpty()){
                Node current=rightStack.pop();
                if(current.right!=null)
                    leftStack.push(current.right);
                if(current.left!=null)
                    leftStack.push(current.left);
                System.out.print(current.data+" ");

            }
            System.out.println();
        }
    }
    void printSpiralWithDeque(Node root){
        if(root==null)
            return;
        Node current;
        Deque<Node>  deque=new LinkedList<>();
        deque.offer(null);
        deque.offerFirst(root);
        while (deque.size()>1){
            current=deque.peekFirst();
            while (current!=null){
                current=deque.pollFirst();
                if(current.left!=null)
                    deque.offerLast(current.left);
                if(current.right!=null)
                    deque.offerLast(current.right);
                System.out.print(current.data+" ");
                current=deque.peekFirst();
            }
            System.out.println();
            current=deque.peekLast();
            while (current!=null){
                current=deque.pollLast();
                if(current.right!=null)
                    deque.offerFirst(current.right);
                if(current.left!=null)
                    deque.offerFirst(current.left);
                System.out.print(current.data+" ");
                current=deque.peekLast();
            }
            System.out.println();
        }
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
        SpiralOrder spiralOrder=new SpiralOrder();
      //  spiralOrder.printSpiral(root);
        spiralOrder.printSpiralWithDeque(root);
    }
}
