package com.example.helloworld.producerconsumer.Algos;

/**
 * Created by h128850 on 7/7/16.
 */
public class StckWithLinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    Node head=null;
    int size=0;

    public void pushElement(int data){
        Node x=new Node(data);
        if(size==0){
            head=x;
        }
        else {
            Node temp=head;
            x.next=temp;
            head=x;
        }
        System.out.println("Insertion is success");
        size++;
    }
    public int popElement(){
        if(size==0){
            System.out.println("No Elements in Stack");
            return -1;
        }
        else {
            Node temp=head;
            head=head.next;
            size--;
            System.out.println("Element is popped from Stack "+temp.data);
            return temp.data;
        }
    }

    public static void main(String[] args) {
        StckWithLinkedList stckWithLinkedList=new StckWithLinkedList();
        stckWithLinkedList.pushElement(1);
        stckWithLinkedList.pushElement(2);
        stckWithLinkedList.pushElement(3);
        stckWithLinkedList.pushElement(4);

        stckWithLinkedList.popElement();
        stckWithLinkedList.pushElement(5);
        stckWithLinkedList.popElement();
    }

}
