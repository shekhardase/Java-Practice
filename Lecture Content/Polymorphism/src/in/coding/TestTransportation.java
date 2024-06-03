package in.coding;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle v = new Vehicle();
        CastTest(v);
        CastTest(c);
    }

    // here it is expecting vehicle object but as car is also vehicle (parent) hence it accepts objecct of child also
    private static void CastTest(Vehicle veh) {
        veh.Start();                                       // Start() is called for 2 objects
        // one for car and one for vehicle

        Car cVehicle = (Car) veh;            // to apply this is cars object
    }
}
