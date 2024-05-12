public class object {

    public class car {

        int noOfWheels;
        String color;
        float maxSpeed;
        float CurrentFuel;
        int noOfSeats;

        public void drive() {
            System.out.println("Car is driving");
            CurrentFuel--;
        }

        public void addFuel(float fuel) {
            CurrentFuel += fuel;
        }

        public float GetCurrentFuelLevel() {
            return CurrentFuel;
        }

    }

    public class Driver {

        public static void main(String[] args) {
            object myObject = new object();
            object.car mycar = myObject.new car();

            mycar.drive();

            // object myObject = new object();
            // object.car myCar = myObject.new car();
            // // car mycar = new car();
        }
    }
}
