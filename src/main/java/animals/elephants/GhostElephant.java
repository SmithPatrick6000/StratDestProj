package main.java.animals.elephants;

import main.java.behaviors.sounds.Silent;

public class GhostElephant extends Elephant {
    
    public GhostElephant() {
        super();
        this.soundBehavior = new Silent();
    }
}
