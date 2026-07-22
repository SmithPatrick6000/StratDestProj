package main.java.animals.lions;

import main.java.animals.Animal;
import main.java.behaviors.diet.DietBehavior;
import main.java.behaviors.movement.MoveBehavior;
import main.java.behaviors.sounds.SoundBehavior;

public class Lion extends Animal {
    
    public Lion(MoveBehavior moveBehavior, SoundBehavior soundBehavior, DietBehavior dietBehavior) {
        super(moveBehavior, soundBehavior, dietBehavior);
    }
    
    
    public void performMove() { moveBehavior.move(); }
    public void performSound() { soundBehavior.sound(); }
    public void performDiet() { dietBehavior.diet(); }
}
