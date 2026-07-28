package main.java.animals.snakes;

import main.java.behaviors.sounds.Silent;



public class CommonAdder extends Snake{
    
    public CommonAdder() {
        super();
        this.soundBehavior = new Silent();
    }
}
