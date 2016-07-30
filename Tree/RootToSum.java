package com.example.helloworld.producerconsumer.Tree;

import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sarath on 7/28/16.
 */
public class RootToSum {


    boolean rootToSum(Node root, int sum, List<Integer> result){
        if(root==null)
            return false;
        if(root.left==null && root.right==null){
            if(root.data==sum){
                result.add(root.data);
                return true;
            }else
                return false;
        }
        if(rootToSum(root.left,sum-root.data,result)) {
            result.add(root.data);
            return true;
        }
        if(rootToSum(root.right,sum-root.data,result))
        {
            result.add(root.data);
            return true;
        }
        return false;
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
        RootToSum ro=new RootToSum();
        List<Integer> result=new ArrayList<>();
        System.out.println(ro.rootToSum(root, 15, result));
        System.out.println(result.toString());
    }
}
