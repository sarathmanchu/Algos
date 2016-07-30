package com.example.helloworld.producerconsumer.Tree;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * Created by sarath on 7/28/16.
 */
public class TopViewBT {
    class MapEntry{
        int nodeVal;
        int nodeLvl;

        public MapEntry(int nodeVal, int nodeLvl) {
            this.nodeVal = nodeVal;
            this.nodeLvl = nodeLvl;
        }
    }
    void fillViewMap(Node currNode,int curLvl,int hd,Map<Integer,MapEntry> viewMap){
        if(currNode==null)
            return;
        MapEntry mapEntry=viewMap.get(hd);
        if(mapEntry!=null){
            if(curLvl<=mapEntry.nodeLvl)
            {
                MapEntry nodeEntry=new MapEntry(currNode.data,curLvl);
                viewMap.put(hd,nodeEntry);
            }
        }
        else {
            MapEntry nodeEntry=new MapEntry(currNode.data,curLvl);
            viewMap.put(hd,nodeEntry);
        }
        fillViewMap(currNode.left,curLvl+1,hd-1,viewMap);
        fillViewMap(currNode.right,curLvl+1,hd+1,viewMap);

    }
    void printTopView(Node root){
        Map<Integer,MapEntry> viewMap=new TreeMap<>();
        fillViewMap(root,0,0,viewMap);

        Set<Integer> keySet=viewMap.keySet();
        for (Integer key:keySet) {
            System.out.println(viewMap.get(key).nodeVal);
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
        TopViewBT p = new TopViewBT();
        p.printTopView(root);
    }
}
