package com.company;

import java.util.HashSet;

public class java60_hashset {
    public static void main(String[] args) {
        HashSet<Integer> myhashset = new HashSet<>(6,0.5f);
        myhashset.add(50);
        myhashset.add(50);
        myhashset.add(60);
        myhashset.add(70);
        myhashset.add(80);
        myhashset.add(90);
        System.out.println(myhashset);
        // store non duplicate elements

        // reason of using hashset: Searching operations are done in constant time.   

        
    }
    
}
