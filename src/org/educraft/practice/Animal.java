package org.educraft.practice;

public class Animal {

    protected String name;
    protected int no_legs;
    protected String species;
    protected boolean carnivor;

    public Animal(String name, int no_legs, String species, boolean carnivor){
        this.name = name;
        this.no_legs = no_legs;
        this.species = species;
        this.carnivor = carnivor;
        AnimalOrganizer.assignCage(this);
    }

    public void move(int speed){
        System.out.println("I can walk at a speed of " + speed + ".");
    }

}
