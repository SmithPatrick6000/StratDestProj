package main.java.animals.kangaroos;

import main.java.behaviors.sounds.Bark;

public class EasternGreyKangaroo extends Kangaroo{
    
    public EasternGreyKangaroo() {
        super();
        this.soundBehavior = new Bark();
    }
}
