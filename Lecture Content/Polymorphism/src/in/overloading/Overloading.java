package in.overloading;

public class Overloading {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    Overloading() {
        System.out.println("Default Constructor");
    }

    Overloading(int a) {
        System.out.println("Parameter Constructor");
    }

    public static void main(String[] args) {
        Overloading over = new Overloading();
        System.out.println(over.add(1, 2));
        System.out.println(over.add(1, 2, 3));
    }
}
