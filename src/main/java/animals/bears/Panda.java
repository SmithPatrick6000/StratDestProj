package main.java.animals.bears;

import main.java.behaviors.diet.Herbivore;

public class Panda extends Bear{
    
    public Panda() {
        super(); 
        this.dietBehavior = new Herbivore();
    }
}
