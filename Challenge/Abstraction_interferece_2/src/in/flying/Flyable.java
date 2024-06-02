package in.flying;

public interface Flyable {

    public default void fly() {
        System.out.println("Bird is flying");
    }
}
