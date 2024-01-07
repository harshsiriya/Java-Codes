package com.company;

interface television{
    public void changeVolume();
    public void changeChanel();
}

interface SmartTv extends television{
    public void google();
    public void xbox();
}

class tv1 implements television{
    public void changeVolume(){
        System.out.println("Changing volume");
    }
    public void changeChanel(){
        System.out.println("Changing Chanel");
    }
}
class stv implements SmartTv{
    public void changeVolume(){
        System.out.println("Changing volume");
    }
    public void changeChanel(){
        System.out.println("Changing Chanel");
    }
    public void google(){
        System.out.println("Opening google");
    }
    public void xbox(){
        System.out.println("Xbox Games Are on the way");
    }
}
public class exe13_pp05_pp06_Tv {
    public static void main(String[] args) {
        stv st1 = new stv();
        st1.changeChanel();
        st1.changeVolume();
        st1.google();
        st1.xbox();
        System.out.println("*****************************");

        tv1 t1  = new tv1();
        t1.changeVolume();
        t1.changeChanel();
    }
    
}
