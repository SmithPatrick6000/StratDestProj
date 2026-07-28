package main.java.animals.fishs;

import main.java.animals.Animal;
import main.java.behaviors.diet.Herbivore;
import main.java.behaviors.movement.Swim;
import main.java.behaviors.sounds.Silent;

public class Fish extends Animal{
    
    public Fish() {
        super(new Swim(), new Silent(), new Herbivore());
    }
}
