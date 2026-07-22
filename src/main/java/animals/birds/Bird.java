package main.java.animals.birds;

import main.java.animals.Animal;
import main.java.behaviors.diet.Omnivore;
import main.java.behaviors.movement.Fly;
import main.java.behaviors.sounds.Chirp;


public class Bird extends Animal{
    
    public Bird() {
        super(new Fly(), new Chirp(), new Omnivore());
    }
}
