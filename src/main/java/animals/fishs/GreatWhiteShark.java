package main.java.animals.fishs;

import main.java.behaviors.diet.Carnivore;

public class GreatWhiteShark extends Fish{
    
    public GreatWhiteShark() {
        super();
        this.dietBehavior = new Carnivore();
    }
    
}
