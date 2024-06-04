package in.Coding.Enum;

public class Test_Enum {

    public static void main(String[] args) {
        // Loop through all the values of the Day enum and print each one with its type
        for (Day day : Day.values()) {
            System.out.println(day + " is a " + day.getType());
        }
    }
}