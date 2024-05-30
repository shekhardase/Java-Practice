public class Car {

    int NoOfWheels;
    String Color;
    float CurrentFuel;
    int MaxSpeed = 10000;
    int noOfSeats;

    public Car Start() {
        if (CurrentFuel == 0) {
            System.out.println("car is out of Fuel");
        } else if (CurrentFuel < 5) {
            System.out.println("car is in reserved mode , please refuel");
        } else {
            System.out.println("Car is driving , bruh..................");
        }
        return this;
    }

    public int maxSpeed() {
        return MaxSpeed;
    }

    public void Driving() {
        CurrentFuel--;
        System.out.println("Car is driving");
    }

    public void AddFuel(float fuel) {
        CurrentFuel = CurrentFuel + fuel;
    }

    public float GetCurrentFuel() {
        return CurrentFuel;
    }

    public int getNoOfSeats() {
        System.out.println("The Vehicle is Car");
        return 4;
    }
}
