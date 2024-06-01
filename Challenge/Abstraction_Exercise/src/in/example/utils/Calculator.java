package in.example.utils;

import in.example.geometry.Rectangle;
import in.example.geometry.circle;

public class Calculator {
    public static void main(String[] args) {
        circle cir = new circle(10);
        System.out.println("area of circle is " + cir.area(10));
        System.out.println("Circumference of circle is " + cir.circum(10));


        Rectangle re = new Rectangle(10, 20);
        System.out.println("area of rectangle is " + re.area());
    }
}
