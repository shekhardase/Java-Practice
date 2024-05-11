// // public class constructor {
// //     private int length;
// //     private int width;
// //     private int area;

// //     public constructor(int length, int width) {
// //         this.length = length;
// //         this.width = width;
// //     }

// //     public int calculateArea() {
// //         area = length * width;
// //         return area;
// //     }

// //     public static void main(String[] args) {
// //         constructor rectangle = new constructor(5, 10);
// //         int area = rectangle.calculateArea();
// //         System.out.println("Area of rectangle: " + area);
// //     }
// // }

// public class constructor {
//     int length, width;

//     // parametrized constructor
//     public constructor(int x, int y) {
//         length = x;
//         width = y;
//     }

//     // calculate area
//     public int area() {
//         return length * width;
//     }

//     public int square()
//     {
//         return length* length;
//     }

//     public static void main(String[] args) {
//         constructor myrectangle = new constructor(3, 4);
//         System.err.println(myrectangle.area());
//         System.err.println(myrectangle.square());
//     }
// }

//constuctor to create addition of 3 numbers take input from user use method overloading 
public class constructor {
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public float add(float a, float b, float c) {
        return a + b + c;
    }

    public int factorial(int a) {
        if (a == 0 || a == 1) {
            return 1;
        }
        return a * factorial(a - 1);
    }

    public double factorial(double a) {
        if (a == 0 || a == 1) {
            return 1.0;
        }
        return a * factorial(a - 1);
    }

    public static void main(String[] args) {
        constructor chiku = new constructor();
        int sum2 = chiku.add(2, 3, 2);
        float sum3 = chiku.add(2.1f, 3.1f, 4.1f);
        int fact = chiku.factorial(5);
        double fact_float = chiku.factorial(3.3f);
        System.out.println("Sum of 2 numbers: " + sum2);
        System.out.println("Sum of 3 numbers: " + sum3);
        System.err.println("Factorial of numbers int " + fact);
        System.err.println("Factorial of numbers float " + fact_float);
    }
}
