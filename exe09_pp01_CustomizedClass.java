package com.company;

class employee{
    int salary;
    public void get_salary(){
        System.out.println(salary);
    }
    String name;
    public void get_name(){
        System.out.println(name);
    }
    public void set_name(){
        name = "Siriya";
        System.out.println(name);
    }
}

public class exe09_pp01_CustomizedClass {
    public static void main(String[] args) {
        employee harsh = new employee();
        harsh.salary = 50000;
        System.out.println(harsh.salary);

        harsh.get_salary();

        harsh.name = "harsh";
        harsh.get_name();

        harsh.set_name();
    }
    
}
