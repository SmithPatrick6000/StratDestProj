package main.java.animals.elephants;

import main.java.animals.Animal;
import main.java.behaviors.diet.Herbivore;
import main.java.behaviors.movement.Walk;
import main.java.behaviors.sounds.Trumpet;

public class Elephant extends Animal{
    
    public Elephant() {

        super(new Walk(), new Trumpet(), new Herbivore());
    }
}
