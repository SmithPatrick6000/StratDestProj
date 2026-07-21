package main.java.animals;

import main.java.behaviors.movement.MoveBehavior;

public abstract class Animal {

    protected MoveBehavior moveBehavior;
    public Animal(MoveBehavior moveBehavior) { this.moveBehavior = moveBehavior; }
    public void performMove() { moveBehavior.move(); }

}
