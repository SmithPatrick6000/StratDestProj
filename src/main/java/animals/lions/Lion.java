package main.java.animals.lions;

import main.java.animals.Animal;
import main.java.behaviors.diet.Carnivore;
import main.java.behaviors.movement.Walk;
import main.java.behaviors.sounds.Roar;

public class Lion extends Animal {
    
    public Lion() {

        super(new Walk(), new Roar(), new Carnivore());
    }
    

}
