package bai7.th3;

import bai7.th2.Circle;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------COMPARATOR----------");
        Circle[] circles = new Circle[3];
        circles[0] = new Circle(3);
        circles[1] = new Circle();
        circles[2] = new Circle(3.5,"green",true);

        System.out.println("Pre-Sorted");
        for (Circle circle : circles){
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted:");
        for (Circle circle : circles){
            System.out.println(circle);
        }
    }
}
