package com.example.helloworld.producerconsumer.Tree;

/**
 * Created by h128850 on 7/30/16.
 */

public class MaxBST {

    class MinMax{
        int min;
        int max;
        boolean isBST;
        int size;
        public MinMax() {
            min=Integer.MAX_VALUE;
            max=Integer.MIN_VALUE;
            isBST=true;
            size=0;
        }
    }
    private MinMax largest(Node root){
        if(root==null)
            return new MinMax();
        MinMax leftMinMax=largest(root.left);
        MinMax rightMinMax=largest(root.right);
        MinMax m=new MinMax();

        if(leftMinMax.isBST==false || rightMinMax.isBST==false || leftMinMax.max>root.data || rightMinMax.min<=root.data)
        {
            m.isBST=false;
            m.size=Math.max(leftMinMax.size,rightMinMax.size);
            return m;
        }
        m.isBST=true;
        m.size=leftMinMax.size+rightMinMax.size+1;
        m.min=root.left!=null?leftMinMax.min:root.data;
        m.max=root.right!=null?rightMinMax.max:root.data;

        return m;

    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(6);
        root.right = new Node(12);
        root.left.left = new Node(7);
        root.left.right = new Node(4);
        root.right.left=new Node(1);
        root.right.right=new Node(14);
        root.right.right.right=new Node(16);
        root.right.right.left=new Node(13);
        MaxBST maxBST=new MaxBST();
        System.out.println(maxBST.largest(root).size);
    }
}
