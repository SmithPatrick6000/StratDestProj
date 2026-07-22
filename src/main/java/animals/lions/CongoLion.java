package main.java.animals.lions;

import main.java.behaviors.diet.Carnivore;
import main.java.behaviors.movement.Walk;
import main.java.behaviors.sounds.Roar;



public class CongoLion extends Lion{
    
    public CongoLion() {
        super(new Walk(), new Roar(), new Carnivore());
    }
}
