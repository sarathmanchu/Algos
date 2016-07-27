package com.example.helloworld.producerconsumer.Tree;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by sarath on 7/27/16.
 */
public class AllPaths {
    public static void main(String[] args) {
        Node root = new Node(5);
        root.left = new Node(10);
        root.right = new Node(15);
        root.left.left = new Node(20);
        root.left.right = new Node(25);
        root.right.left = new Node(30);
        root.right.right = new Node(35);
        root.left.left.left = new Node(45);
        int[] path=new int[100];int pathLen=0;
        printRootToLeaf(root,path,pathLen);
    }
    static void printRootToLeaf(Node node,int[] path,int pathLen){
        if(node==null)
            return;
        path[pathLen]=node.data;
        pathLen++;
        if(node.left==null && node.right==null)
            printArray(path,pathLen);
        else {
            printRootToLeaf(node.left,path,pathLen);
            printRootToLeaf(node.right,path,pathLen);
        }
    }
    static void printArray(int ints[], int len)
    {
        int i;
        for (i = 0; i < len; i++)
            System.out.print(ints[i] + " ");
        System.out.println("");
    }
}
