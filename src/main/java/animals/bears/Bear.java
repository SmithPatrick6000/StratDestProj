package main.java.animals.bears;

import main.java.animals.Animal;
import main.java.behaviors.diet.Omnivore;
import main.java.behaviors.movement.Walk;
import main.java.behaviors.sounds.Growl;

public class Bear extends Animal{
    
    public Bear() {
        super(new Walk(), new Growl(), new Omnivore());
    }
}
