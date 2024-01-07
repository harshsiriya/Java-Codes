package com.company;

class cellphone{
    public void ringing(){
        System.out.println("Its Ringing ... Pick up the call !");
    }
    public void vibrating(){
        System.out.println("Its vibrating ... Pick up the call !");
    }
}
public class exe09_pp02_cellphoone {
    public static void main(String[] args) {
        cellphone vivo = new cellphone();
        vivo.ringing();;
        vivo.vibrating();
    }
    
}
