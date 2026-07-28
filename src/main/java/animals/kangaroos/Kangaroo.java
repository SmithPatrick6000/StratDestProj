package main.java.animals.kangaroos;

import main.java.animals.Animal;
import main.java.behaviors.diet.Herbivore;
import main.java.behaviors.movement.Jump;
import main.java.behaviors.sounds.Hiss;

public class Kangaroo extends Animal{
    
    public Kangaroo() {
        super(new Jump(), new Hiss(), new Herbivore());
    }
}
