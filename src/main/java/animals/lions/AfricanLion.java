package main.java.animals.lions;

import main.java.behaviors.sounds.Silent;



public class AfricanLion extends Lion{
    
    public AfricanLion() {
        super();
        this.soundBehavior = new Silent();
    }
}
