package main.java.animals.anteaters;

import main.java.behaviors.sounds.Silent;

public class SilkyAnteater extends Anteater{
    
    public SilkyAnteater() {
        super();
        this.soundBehavior = new Silent();
    }
}
