public class Overload {


    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a) {
        System.out.println("Fuck you ");
        return 0;
    }

    public static void main(String[] args) {
        Overload ov = new Overload();

        System.out.println(ov.add(1));
        System.out.println(ov.add(1, 2));
        System.out.println(ov.add(12.3, 23.23));
        System.out.println(ov.add(1, 2, 3, 4));
    }

}
