package com.company;

import java.util.*;
public class java56_arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList<Integer>();
        ArrayList<Integer> l2 = new ArrayList<Integer>();
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
