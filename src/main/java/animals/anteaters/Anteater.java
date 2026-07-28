package main.java.animals.anteaters;

import main.java.animals.Animal;
import main.java.behaviors.diet.Insectivore;
import main.java.behaviors.movement.Walk;
import main.java.behaviors.sounds.Hiss;

public class Anteater extends Animal{
    
    public Anteater() {
        super(new Walk(), new Hiss(), new Insectivore());
    }
}
