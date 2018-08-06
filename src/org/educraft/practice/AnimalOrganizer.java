package org.educraft.practice;

import java.util.ArrayList;
import java.util.List;

public class AnimalOrganizer {

    public static List<Animal> predatorCage = new ArrayList<Animal>();
    public static List<Animal> herbivoreCage = new ArrayList<Animal>();

    public static void assignCage(Animal animal){
        if(animal.carnivor){
            predatorCage.add(animal);
        }
        else {
            herbivoreCage.add(animal);
        }
    }

}
