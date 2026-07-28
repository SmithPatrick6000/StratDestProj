package main.java.animals.seals;

import main.java.behaviors.sounds.Roar;

public class ElephantSeal extends Seal{
    
    public ElephantSeal(){
        super();
        this.soundBehavior = new Roar();
    }
}
