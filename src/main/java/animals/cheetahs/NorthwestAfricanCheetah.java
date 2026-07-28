package main.java.animals.cheetahs;

import main.java.behaviors.sounds.Silent;

public class NorthwestAfricanCheetah extends Cheetah{
    
    public NorthwestAfricanCheetah() {
        super();
        this.soundBehavior = new Silent();
    }
}
