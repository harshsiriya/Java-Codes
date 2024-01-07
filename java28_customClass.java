package com.company;

class employee{
    int id;
    String name;
    public void print_details(){
        System.out.println("My ID : "+ id);
        System.out.println("My name : " + name);
    }
}

public class java28_customClass {
    public static void main(String[] args) {
        System.out.println("this is our custom class : ");

        // creating a  new object for a class employee
        employee harsh = new employee();
        employee ayush = new employee();

        // setting id and name for object harsh
        harsh.id = 001;
        harsh.name = "harsh";
        ayush.id = 002;
        ayush.name = "ayush";

        // displaying id and name of customized class into main class(default class)
        System.out.println(harsh.id);
        System.out.println(harsh.name);

        // displaying id and name using method

        harsh.print_details();
        ayush.print_details();
    }
    
}
