package in.Coding.Enum;

public enum Day {
    Monday("Weekday"),
    Wednesday("Weekday"),
    Thursday("Weekday"),
    Friday("Weekday"),
    Saturday("Weekend"),
    Sunday("Weekend");

    private final String type;

    // Constructor to initialize the type
    Day(String type) {
        this.type = type;
    }

    // Method to return the type of the day
    public String getType() {
        return type;
    }
}
