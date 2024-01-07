package com.company;

public class java24_methodOverloading {
    static void change(int []a){
        a[0] = 45;
    }
    static void great(){
        System.out.println("helllo everyone ");
        System.out.println("may your day spend well !");
    }
    public static void main(String[] args) {
        great();

        //case for changing occurs in array
        int  marks[] = {98,56,75,51,36,89};
        change(marks);
        System.out.print("after case 1 : ");
        System.out.println(marks[1]);
         
    }
    
}
