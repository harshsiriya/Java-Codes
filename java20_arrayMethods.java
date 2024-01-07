package com.company;

public class java20_arrayMethods {
    public static void main(String[] args) {
        int []marks ={98,78,85,65,84};
        System.out.println(marks[0]);
        System.out.println(marks.length);


        float  []marks1 = {98.5f, 96.5f, 56.5f,75.5f,69.5f};
        System.out.println(marks1[0]);

        String  []students = {"harsh", "bhute", "ayush", "karan", "nikam"};
        System.out.println(students[0]); 

        // displaying from a particular array using for loop
        System.out.println("printing using for loop:");
        for(int i = 0;i<marks.length;i++){
            System.out.println(marks[i]);
        }

        //displaying array in reverse  order
        System.out.println("reversed array is");
        for(int i = marks.length-1 ;i>=0 ; i--){
            System.out.println(marks[i]);
        }


        //for each loop(to display array)
        System.out.println("display using for each loop");
        for(int Element : marks){
            System.out.println(Element);
        }
    }
    
}
