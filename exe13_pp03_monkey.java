package com.company;

interface basicAnimal{
    public void eat();
    public void sleep();
}
class monkey{                                         // Q5.) object of class Human can be callled as monkey when it is performing operations such as jump and bite
    void jump(){
        System.out.println("Jumping Jumping..");
    }
    void bite(){
        System.out.println("Biting Biting..");
    }
}

class human extends monkey implements basicAnimal{
    public void eat(){
        System.out.println("Eating Eating");
    }
    public void sleep(){
        System.out.println("Sleeping sleeping..");
    }
}
public class exe13_pp03_monkey {
    public static void main(String[] args) {
        human h1 = new human();
        h1.jump();
        h1.bite();
        h1.eat();
        h1.sleep();
    }
    
}
