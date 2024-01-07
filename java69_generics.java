package com.company;

import java.util.ArrayList;

class mygeneric<T1>{
    int val = 344;
    private String t1;
    public mygeneric(int val, String t1) {
        this.val = val;
        this.t1 = t1;
        
    }
    public int getVal(){
        return val;
    }
    public void setval(int val){
        this.val = val;
    }
    public String getT1(){
        return t1;
    }
    public void setT1(String t1){
        this.t1 = t1;
    }

}

public class java69_generics {
    public static void main(String[] args) {
        ArrayList a1 = new ArrayList<>();
        a1.add("str");
        a1.add(54);
        a1.add(59);
        a1.add(643);

        // int a = a1.get(2);  This is not correct in case of multiple datatypes arraylist

        int a = (int)a1.get(2);  // Type casting 
        System.out.println(a);

        ArrayList<Integer> a2 = new ArrayList<>();   // Integer is generic in this case 
        // Generiic helps in type safety
        a2.add(12);
        int a12 = a2.get(0);
        System.out.println(a12);



        mygeneric g1 = new mygeneric(21, "MyString");
        String str = g1.getT1();
        System.out.println(str);


        // we generally supply classes to already defined class .
    }
    
}
