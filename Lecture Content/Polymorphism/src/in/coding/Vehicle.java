package in.coding;

public abstract class Vehicle {
    private int noOfTyers;

    Vehicle() {
        this.noOfTyers = 0;
    }

    Vehicle(int noOfTyers) {
        this.noOfTyers = noOfTyers;
    }

    public int getNoOfTyers() {
        return this.noOfTyers;
    }

    public void Start() {
        System.out.println("Bruruurrururururu");
    }
}
