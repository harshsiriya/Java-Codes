package com.company;

class myemployee{
    private int id;
    private String name;
    public void set_id(int i){
        this.id = i;
    }
    public int get_id(){
        return id;
    }

    public void set_name(String n){
        this.name = n;
    }
    public String get_name(){
        return name;
    }

}
public class java29_accessModifiers {
    public static void main(String[] args) {
        System.out.println("Access Modifiers : ");
        myemployee harsh = new myemployee(); 
        /*
        harsh.id = 20;
        harsh.name = "Harsh";          throughs an error due to private access modifiers ....
        */

        harsh.set_name("Harsh Siriya");
        System.out.println(harsh.get_name());

        harsh.set_id(89);
        System.out.println(harsh.get_id());


    }
    
}
