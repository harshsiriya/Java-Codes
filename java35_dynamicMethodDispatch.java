package com.company;

class phone {
    public void showtime(){
        System.out.println("Time is 8 am");
    }
    public void on(){
        System.out.println("Turing on phone..");
    }
}
class smartphone extends phone{
    public void music(){
        System.out.println("playing music");
    }
    public void on(){
        System.out.println("Turing on Smart phone..");
    }
}
public class java35_dynamicMethodDispatch {
    public static void main(String[] args) {
        phone obj = new phone();
        obj.on();

        phone obj1 = new smartphone();                                      // superclass refrence can be equal to subcalss object but 'not' vice versa..
        obj1.on();                                                        // apne refrence use kiya phone ka , or object bana diya smart phone ka
                                                                        // aap smartphone ko phone kah sakte ho, but aap normal phone ko smartphone nahi kah sakte

        // obj1.music();                                // this thing is not allowed in java, if u r choosing the reference of phone u cannot play music(method of smartphone)
    }             
    
}
