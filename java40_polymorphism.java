package com.company;

interface camera2{
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

interface wifi2{
    String[] getNetworks();
    void connectNetwork(String network);

}
class MyCellPhone2{
    void callNumber(int phonenumber){
        System.out.println("Calling : " + phonenumber);
    }
    void pickcall(){
        System.out.println("Ringing : " );
    }
}

class MySmartPhone2 extends MyCellPhone2 implements wifi2 , camera2{
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
public class java40_polymorphism {
    public static void main(String[] args) {
        camera2 cam1 = new MySmartPhone2();  // This is a smartphone but use this only as a camera.

        // cam1.getNetworks();               Not allowed in java (Provides Polymorphism)        
        cam1.takesnap();
        cam1.record4KVideo();

        MySmartPhone2 ms = new MySmartPhone2();
        ms.recordVideo();
        ms.getNetworks();
        ms.connectNetwork("Vivo V21E");
        ms.callNumber(99750);
         

    }
    
}
