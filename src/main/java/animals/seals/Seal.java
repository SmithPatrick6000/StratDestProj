package main.java.animals.seals;

import main.java.animals.Animal;
import main.java.behaviors.diet.Carnivore;
import main.java.behaviors.movement.Swim;
import main.java.behaviors.sounds.Silent;

public class Seal extends Animal{
    
    public Seal() {
        super(new Swim(), new Silent(), new Carnivore());
    }
}
