package Classes_Objects;

/**
 * The type Car.
 */
public class car {
    int noOfWheels;
    int noOfSeats;
    String color;
    float MaxSpeed;
    float CurrentFuel;

    public void drive() {
        System.out.println("Car is running");
        CurrentFuel--;
    }

    /**
     * Add fuel.
     *
     * @param fuel the fuel
     */
    public void addFuel(float fuel) {
        CurrentFuel = CurrentFuel + fuel;
    }

    public float GetCurrentFuel( ) {
        return CurrentFuel;
    }

}
