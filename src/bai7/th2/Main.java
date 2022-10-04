package bai7.th2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("------------COMPARABLE----------");
        ComparableCircle[]  circles = new ComparableCircle[3];
        circles[0] = new ComparableCircle(3.9);
        circles[1] = new ComparableCircle();
        circles[2] = new ComparableCircle(7.9,"green",true);

        System.out.println("Pre-sorted: ");
        for (ComparableCircle comparableCircle : circles){
            System.out.println(comparableCircle);
        }

        Arrays.sort(circles);

        System.out.println("After-sorted");
        for (ComparableCircle comparableCircle : circles){
            System.out.println(comparableCircle);
        }
    }
}
