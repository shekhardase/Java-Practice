package in.example.geometry;

public class circle {
    public int radius;
    final static double PI = 3.14;

    public circle(int radius) {
        this.radius = radius;
    }

    public double area(int radius) {
        return PI * radius * radius;
    }

    public double circum(int radius) {
        return 2 * PI * radius;
    }
}
