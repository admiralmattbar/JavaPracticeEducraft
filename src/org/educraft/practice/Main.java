package org.educraft.practice;

import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Animal benji = new Animal("Benji", 4, "dog", true);
        getAnimalData(benji, 5);

        Animal theodore = new Cat("Theodore", 4);
        getAnimalData(theodore, 9);

        Animal plucky = new Fish("Plucky", false);
        getAnimalData(plucky, 5);
        
        getCages();

    }

    public static void getAnimalData(Animal animal, int speed){
        System.out.println("My name is " + animal.name + ", I am a " + animal.species + ". I have " + animal.no_legs + " legs.");
        if(animal.carnivor == true){
            System.out.println("I eat meat.");
        } else {
            System.out.println("I eat plants.");
        }
        animal.move(speed);
        if(animal instanceof Sounds){
            System.out.println(((Sounds)animal).speak());
        }
    }

    public static void getCages(){

        System.out.println("\n");
        System.out.print("Herbivore Cage: ");
        for(Animal animal : AnimalOrganizer.herbivoreCage) {
            System.out.print(animal.name + " : " + animal.species);
        }
        System.out.println("\n");


        System.out.print("Carnivore Cage: ");
        for(Animal animal : AnimalOrganizer.predatorCage) {
            System.out.print(animal.name + " : " + animal.species + ", ");
        }
        System.out.println("\n");

    }


}
