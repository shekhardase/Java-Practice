// public class constructor {
//     private int length;
//     private int width;
//     private int area;

//     public constructor(int length, int width) {
//         this.length = length;
//         this.width = width;
//     }

//     public int calculateArea() {
//         area = length * width;
//         return area;
//     }

//     public static void main(String[] args) {
//         constructor rectangle = new constructor(5, 10);
//         int area = rectangle.calculateArea();
//         System.out.println("Area of rectangle: " + area);
//     }
// }

public class constructor {
    int length, width;

    // parametrized constructor
    public constructor(int x, int y) {
        length = x;
        width = y;
    }



    // calculate area
    public int area() {
        return length * width;
    }

    public int square()
    {
        return length* length;
    }

    public static void main(String[] args) {
        constructor myrectangle = new constructor(3, 4);
        System.err.println(myrectangle.area());
        System.err.println(myrectangle.square());
    }
}