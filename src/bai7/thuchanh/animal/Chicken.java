package bai7.thuchanh.animal;

import bai7.thuchanh.edible.IEdible;

public class Chicken extends Animals implements IEdible {
    @Override
    public String makeSound() {
        return "Chicken: cluck cluck!";
    }
    @Override
    public String howToEat() {
        return "could be friend";
    }
}
