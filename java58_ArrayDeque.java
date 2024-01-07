package com.company;

import java.util.ArrayDeque;

public class java58_ArrayDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();       // ArrayDeque is noting but an array which is capable of inserting and deleting elements of array from both the ends(first and last).
        ad1.add(32);
        ad1.add(54);
        System.out.println(ad1);

        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());

        ad1.addFirst(6);
        ad1.addLast(78);
        System.out.println(ad1);
    }
    
}
