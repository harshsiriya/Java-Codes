package com.company;

public class exe08_pp09_tempInFarahnite {
    static float tempf(int tempc){
        float temp = (tempc * 9/5) + 32;
        return temp;
    }
    public static void main(String[] args) {
        System.out.println(tempf(40));
    }
    
}
