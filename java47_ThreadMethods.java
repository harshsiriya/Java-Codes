package com.company;

class mynewthr1 extends Thread{
    public void run(){
        int a = 34;
        while(true){
            System.out.println("Thank you! : " + this.getName());
        }
    }
}

class mynewthr2 extends Thread{
    public void run(){
        int a = 34;
        while(true){
            System.out.println("Thank you! : " + this.getName());
        }
    }
}


public class java47_ThreadMethods {
    public static void main(String[] args) {
        mynewthr1 t1 = new mynewthr1();
        mynewthr1 t2 = new mynewthr1();

        t1.start();


        try{
            t1.join();                // join method will help the jvm to first completly finsh the task 1 rather than shifting to task 2
        }catch(Exception e){           // only join function will through an exception error thats why we have implemented try and catch block for exception handling
            System.out.println(e);      // current output of the code is printing only t1.start() method (because of join method).
        }


        t2.start();

    }
    
}
