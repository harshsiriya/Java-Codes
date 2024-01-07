package com.company;

@FunctionalInterface
interface myfunctionalinterface{     // functional interface is a interface which consist of only one abstract method initiation
    void thismethod();
}


class newClass extends phone{     // from dynamic Dispach
    @Override
    public void showtime(){
        System.out.println("Time is 8 pm");
    }

    @Deprecated
    public int sum(int a, int b){
        return a+b;
    }
}
public class java67_annotation {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        // Annotation : annotation provides extra information about the program, it provides the meta data about class/Methods.
        // compiler changes its behaviour accourding to annotations
        
        newClass p1 = new newClass();
        p1.showtime();
        System.out.println(p1.sum(5,6));
    }
    
}
