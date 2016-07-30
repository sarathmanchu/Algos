package com.example.helloworld.producerconsumer.Tree;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by sarath on 7/27/16.
 */
public class VerticalOrder {
     int level;
    TreeMap<Integer,ArrayList> ht=new TreeMap<>();
    ArrayList<Integer> al;

    Node printVertical(Node root,int level){
        if(root==null)
            return null;
        Node y=printVertical(root.left,--level);
        if(y==null)
            level++;
        if(ht.get(level)!=null){
            ArrayList x=ht.get(level);
            x.add(root.data);
            ht.put(level,x);
        }else {
            al=new ArrayList<>();
            al.add(root.data);
            ht.put(level,al);
        }
        return printVertical(root.right,++level);
    }
    
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);
       // root.left.left.left = new Node(45);
        //root.left.left.left.left = new Node(46);

        VerticalOrder v=new VerticalOrder();
        v.printVertical(root,0);
        v.printMap(v.ht);
    }
    void printMap(TreeMap ht){
        Set<Integer> i=ht.keySet();
        for (int keys:i
             ) {
            System.out.println(ht.get(keys)+" ");
        }
    }

}
