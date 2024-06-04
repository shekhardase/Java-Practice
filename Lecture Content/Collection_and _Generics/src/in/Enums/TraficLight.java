package in.Enums;

public enum TraficLight {

    RED("Stop"), GREEN("Go"), YELLOW("Wait");
    private final String action;

    TraficLight(String action) {
        this.action = action;
    }
}
