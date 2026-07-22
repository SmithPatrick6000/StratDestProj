package main.java;

import main.java.animals.Animal;
import main.java.animals.lions.*;

public class Test {
    
    public static void main(String[] args) {
        Animal congoLion = new CongoLion();

        congoLion.performMove();
        congoLion.performSound();
        congoLion.performDiet();

        Animal africanLion = new AfricanLion();

        africanLion.performMove();
        africanLion.performSound();
        africanLion.performDiet();

    }
    
}
