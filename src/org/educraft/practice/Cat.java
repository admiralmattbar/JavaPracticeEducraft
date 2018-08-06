package org.educraft.practice;

public class Cat extends Animal implements Sounds {

    public Cat(String name, int no_legs) {
        super(name, no_legs, "cat", true);
    }

    @Override
    public String speak() {
        return "Meow!";
    }
}
