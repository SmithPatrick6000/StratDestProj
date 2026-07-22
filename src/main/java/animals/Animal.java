package main.java.animals;

import main.java.behaviors.diet.DietBehavior;
import main.java.behaviors.movement.MoveBehavior;
import main.java.behaviors.sounds.SoundBehavior;

public abstract class Animal {

    protected MoveBehavior moveBehavior;
    protected SoundBehavior soundBehavior;
    protected DietBehavior dietBehavior;

    public Animal(MoveBehavior moveBehavior, SoundBehavior soundBehavior, DietBehavior dietBehavior) { 
        this.moveBehavior = moveBehavior; 
        this.soundBehavior = soundBehavior;
        this.dietBehavior = dietBehavior;
    }

    public void performMove() { moveBehavior.move(); }
    public void performSound() { soundBehavior.sound(); }
    public void performDiet() { dietBehavior.diet(); }
    
}
