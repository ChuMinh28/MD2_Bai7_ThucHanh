package bai7.thuchanh;

import bai7.thuchanh.animal.Animals;
import bai7.thuchanh.animal.Chicken;
import bai7.thuchanh.animal.Tiger;
import bai7.thuchanh.edible.IEdible;
import bai7.thuchanh.fruit.Apple;
import bai7.thuchanh.fruit.Fruit;
import bai7.thuchanh.fruit.Orange;

public class Main1 {
    public static void main(String[] args) {
        Animals[] animals = new Animals[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animals animals1 : animals){
            System.out.println(animals1.makeSound());

            if (animals1 instanceof Chicken){
                IEdible edible = (Chicken) animals1;
                System.out.println(edible.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0]= new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits){
            System.out.println(fruit.howToEat());
        }
    }
}
