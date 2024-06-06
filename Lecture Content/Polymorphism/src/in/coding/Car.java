package in.coding;

public class Car extends Vehicle {

    private int noOfTyer;

    Car() {
        super(0);
    }

    Car(int noOfTyer) {
        super(noOfTyer);
    }

    public int NoofDoor() {
        return 4;
    }

    @Override
    public void Start() {
        super.Start();
        super.getNoOfTyers();
    }
}
