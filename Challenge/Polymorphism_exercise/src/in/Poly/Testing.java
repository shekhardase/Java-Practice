package in.Poly;

public class Testing extends Vehicle {

    public static void main(String[] args) {
        Testing ts = new Testing();

        ts.service();

        Car cs = new Car();
        cs.service();

        Testing ss = new Testing();
        ss.service();
    }
}
