package main.java.animals.snakes;

import main.java.animals.Animal;
import main.java.behaviors.diet.Carnivore;
import main.java.behaviors.movement.Slither;
import main.java.behaviors.sounds.Hiss;

public class Snake extends Animal{
    
    public Snake() {
        super(new Slither(), new Hiss(), new Carnivore());
    }
}
