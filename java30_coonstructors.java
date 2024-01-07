package com.company;

class myMainEmployee{
    private int id;
    private String name;
    public void set_id(int i){
        this.id = i;
    }
    public int get_id(){
        return id;
    }
    public void set_name(String n ){
        this.name = n;
    }
    public String get_name(){
        return name;
    }                                                                
                                                                         //  we define a method same as name of a class 
    public myMainEmployee( int id1 , String myname){                    // constructor 
        id = id1;                                                      // get automaticallly invocated 
        name = myname;                                                // without any explicit invocation  
                                                                    // you can overload the methods of class name by differentiating the parameters
    }

}
public class java30_coonstructors {
    public static void main(String[] args) {
        System.out.println("here we go ! ");
        System.out.println("  ");
        myMainEmployee harsh = new myMainEmployee(12, "harshu bhai");
        
        //harsh.set_id(90);
        System.out.println(harsh.get_id());

        //harsh.set_name("harsh siriya");
        System.out.println(harsh.get_name());


    }
    
}
