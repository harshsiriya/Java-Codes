package com.company;

interface camera{
    void takesnap();
    void recordVideo();
    private void  potrait(){                     // Private methods can be used in such a way
        System.out.println("Blur");
    }
    default void record4KVideo(){               // default methods are introduced in java to modify the written interfaces 
        potrait();                                      
        System.out.println("Recording 4K Video");          // Works as an normal method to an object of an implemented class
    }
}

interface wifi{
    String[] getNetworks();
    void connectNetwork(String network);

}
class MyCellPhone{
    void callNumber(int phonenumber){
        System.out.println("Calling : " + phonenumber);
    }
    void pickcall(){
        System.out.println("Ringing : " );
    }
}

class MySmartPhone extends MyCellPhone implements wifi , camera{
    public void takesnap(){
        System.out.println("Taking Snap Shot..");
    }
    public void recordVideo(){
        System.out.println("Recording Video");
    }
    public String[] getNetworks(){
        System.out.println("Getting list of networks");
        String[] newlist = {"Harsh" , "Karan" , "Ayush"};
        return newlist;
    }
    public void connectNetwork(String network){
        System.out.println("Connecting to " + network);
    }
}
public class java38_defautMethods {
    public static void main(String[] args) {
        MySmartPhone ms = new MySmartPhone();
        ms.record4KVideo();
        String[] ar = ms.getNetworks();
        for(String item : ar){
            System.out.println(item);
        }
    }
    
}
