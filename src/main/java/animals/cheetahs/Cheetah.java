package main.java.animals.cheetahs;

import main.java.animals.Animal;
import main.java.behaviors.diet.Carnivore;
import main.java.behaviors.movement.Walk;
import main.java.behaviors.sounds.Chirp;

public class Cheetah extends Animal{
    
    public Cheetah() {
        super(new Walk(), new Chirp(), new Carnivore());
    }
}
