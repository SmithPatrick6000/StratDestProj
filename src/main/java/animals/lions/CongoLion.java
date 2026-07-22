package main.java.animals.lions;

import main.java.behaviors.sounds.Roar;



public class CongoLion extends Lion{
    
    public CongoLion() {
        super();
        this.soundBehavior = new Roar();
    }
}
