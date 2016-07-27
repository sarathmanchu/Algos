package com.example.helloworld.producerconsumer.Tree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by sarath on 7/26/16.
 */
public class LevelOrder {
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.left.left.right=new Node(8);
        levelOrder(root);
    }
    static void levelOrder(Node root){
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()){
            Node current=queue.poll();
            if(current==null){
                System.out.println();
                if(!queue.isEmpty())
                queue.add(null);
            }
            else {
                System.out.print(current.data+" ");
                if (current.left != null)
                    queue.add(current.left);
                if (current.right != null)
                    queue.add(current.right);
            }
        }
    }
}
