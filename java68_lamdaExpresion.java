package com.company;

@FunctionalInterface
interface DemoAno{
    void meth1();
    // void meth2();
}


// class fun implements DemoAno{
//     @Override 
//     public void meth1(){
//         System.out.println("This is Meth 1");
//     }
// }


// class AnonyDemo implements DemoAno{
//     void display(){
//         System.out.println("Hello");
//     }
//     @Override
//     public void meth1(){
//         System.out.println("I am meth 1");
//     }
//     @Override
//     public void meth2(){
//         System.out.println("I am meth 2");
//     }
// }

public class java68_lamdaExpresion {
    public static void main(String[] args) {
        // AnonyDemo a1 = new AnonyDemo();
        // a1.meth1();
        
        DemoAno obj = new DemoAno() {                  // this is annomous class
            @Override                                    // obj created with refrence of interface  
            public void meth1(){                            // use of this technique is to create obj without writting any class 
                System.out.println("I am meth 1");
            }
            // @Override
            // public void meth2(){
            //     System.out.println("I am meth 2");
            // }
        };


        obj.meth1();

        // Lamda Expresssion

        // DemoAno f1 = new fun();        we do not require this method if we use lamda Expression
        // f1.meth1();

        DemoAno f2 = ()->{           // this is lamda expression
            System.out.println("This is meth 1");            // just override the method and equate with object 
        };
        f2.meth1();
    }
    
}
