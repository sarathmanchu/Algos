package com.example.helloworld.producerconsumer.Tree;

import java.util.Set;
import java.util.TreeMap;

/**
 * Created by sarath on 7/28/16.
 */
public class BottomViewBT {
    class MapEntry{
        int nodeVal;
        int nodeLvl;

        public MapEntry(int nodeVal, int nodeLvl) {
            this.nodeVal = nodeVal;
            this.nodeLvl = nodeLvl;
        }
    }
    void fillViewMap(Node root, int currLvl, int hd, TreeMap<Integer,MapEntry> valMap){
        if(root==null)
            return;
        MapEntry mapEntry=valMap.get(hd);
        if(mapEntry!=null){
            if(currLvl>=mapEntry.nodeLvl){
                MapEntry nodeEntry=new MapEntry(root.data,currLvl);
                valMap.put(hd,nodeEntry);
            }
        }
        else {
            MapEntry nodeEntry=new MapEntry(root.data,currLvl);
            valMap.put(hd,nodeEntry);
        }
        fillViewMap(root.left,currLvl+1,hd-1,valMap);
        fillViewMap(root.right,currLvl+1,hd+1,valMap);
    }
    void printBottomView(Node root){

        TreeMap<Integer,MapEntry> valMap=new TreeMap<>();
        fillViewMap(root,0,0,valMap);

        Set<Integer> keyMap=valMap.keySet();
        for (Integer key:keyMap) {
            System.out.println(valMap.get(key).nodeVal);
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
        BottomViewBT bt=new BottomViewBT();
        bt.printBottomView(root);
    }
}
