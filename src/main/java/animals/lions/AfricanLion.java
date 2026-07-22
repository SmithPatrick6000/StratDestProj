package main.java.animals.lions;

import main.java.behaviors.diet.Carnivore;
import main.java.behaviors.movement.Walk;
import main.java.behaviors.sounds.Silent;



public class AfricanLion extends Lion{
    
    public AfricanLion() {
        super(new Walk(), new Silent(), new Carnivore());
    }
}
