package com.company;

class ekclass{
    int a;
    public int getA() {
        return a;
    }
    
    ekclass(int v){
        this.a = v;                      /// this is refrence
    }                                     // if in case we take 'a' as a variable insted of v, 'this' will provide the refrence of above declared 'a' 
    public int  returnone(){
        return 1;
    }
}

class doclass extends ekclass{
    doclass(int c){
        super(c);                      // super is a refrence variable to refer an immediate parent class 
        System.out.println("Mai ek constructor hu ");
    }
}
public class java33_thisSuper {
    public static void main(String[] args) {
        ekclass ek = new ekclass(5);
        System.out.println(ek.getA());
        doclass doo = new doclass(12);
    }
    
}
