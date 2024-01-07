package com.company;

import java.util.*;

public class java57_linkedList {          // linledlist is used to perform insertion operation very rapidly but the drawback of linkedlist is "for accessing the elements it require time as compare to ArrayList"
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<Integer>();
        LinkedList<Integer> l2 = new LinkedList<Integer>();
        l2.add(67);
        l2.add(89);
        l2.add(97);
        l1.add(6);
        l1.add(6);
        l1.add(6);
        l1.add(6);
        l1.add(6);
        l1.add(6);  
        l1.add(0,5);



        l1.addLast(4);     // this method is available for linkedlist only
        l1.addFirst(456);



        System.out.println(l1.contains(7));
        System.out.println(l1.indexOf(5));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        l1.set(6,566);
        System.out.println(l1);


        // l1.clear();               // this will clear all the elements from the list

        l1.addAll(l2);                            // concatinate two arrays 
        for(int i = 0 ; i < l1.size(); i++){
            System.out.print(l1.get(i));
            System.out.print(", ");
        }
    }
    
}
