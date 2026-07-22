package main.java.animals.birds;

import main.java.behaviors.movement.Walk;

public class Chicken extends Bird{

    public Chicken() {
        super();
        this.moveBehavior = new Walk();
    }
    
}
