package com.example.helloworld.producerconsumer.Algos;

import java.util.Stack;

/**
 * Created by sarath on 7/7/16.
 */
public class MaxNumInStack {
    Stack<Integer> orgStack=new Stack<>();
    Stack<Integer> maxStack= new Stack<>();

    public void insertElement(int e){
        if(orgStack.isEmpty()){
            orgStack.add(e);
            maxStack.add(e);
        }else {
            int max=maxStack.peek();
            maxStack.add(Math.max(max,e));
            orgStack.add(e);
        }
    }
    public int remove(){
        if(!orgStack.isEmpty()){
            maxStack.pop();
            return orgStack.pop();
        }
        return 0;
    }
    public int getMaxElement(){
        return maxStack.peek();
    }

    public static void main(String[] args) {
        MaxNumInStack maxNumInStack=new MaxNumInStack();
        maxNumInStack.insertElement(5);
        maxNumInStack.insertElement(3);
        maxNumInStack.insertElement(8);
        maxNumInStack.insertElement(2);
        maxNumInStack.insertElement(9);

        System.out.println("Max element is "+maxNumInStack.getMaxElement());
        System.out.println("Element Removed "+maxNumInStack.remove());
        System.out.println("Maximum Element is"+maxNumInStack.getMaxElement());
    }
}
