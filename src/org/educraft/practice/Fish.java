package org.educraft.practice;

public class Fish extends Animal {


    public Fish(String name, boolean carnivor) {
        super(name, 0, "fish", carnivor);
    }

    @Override
    public void move(int speed){
        System.out.println("I can swim at the speed of " + speed + ".");
    }
}
