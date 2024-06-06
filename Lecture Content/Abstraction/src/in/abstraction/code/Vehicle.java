package in.abstraction.code;

public abstract class Vehicle implements Transport {
    private int NoTire;

    public Vehicle(int noTire) {
        NoTire = noTire;
    }

    public abstract void StartSound();

    public int getNoTire() {
        return NoTire;
    }

    public void setNoTire(int noTire) {
        NoTire = noTire;
    }

    public void commute() {
        System.out.println("BURRR");
    }
}
