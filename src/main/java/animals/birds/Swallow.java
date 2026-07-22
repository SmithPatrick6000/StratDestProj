package main.java.animals.birds;

import main.java.behaviors.diet.Insectivore;

public class Swallow extends Bird {

    public Swallow() {
        super();
        this.dietBehavior = new Insectivore();
    }
}
