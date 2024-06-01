package in.example.geometry;

public class Rectangle {
    public int length;
    public int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int area() {
        return (this.breadth * 2) + (this.length * 2);
    }
}
