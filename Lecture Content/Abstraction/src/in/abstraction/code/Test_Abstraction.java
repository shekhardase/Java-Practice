package in.abstraction.code;

public class Test_Abstraction {

    public static void main(String[] args) {
//        Vehicle var = new Vehicle();            // now Vehicle class can be only inherited but cannot instiantiate
        Car car = new Car();
        car.commute();                    // we can still access parent class methods as we used extend (inheritance)
    }
}
