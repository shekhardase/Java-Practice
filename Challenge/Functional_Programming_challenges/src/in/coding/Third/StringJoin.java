package in.coding.Third;

import java.util.Arrays;
import java.util.List;

public class StringJoin {
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("Prashant Jain", "bad",
                "is teaching java", "ghatiya", "ganda",
                "on KG Coding", "Best Youtube programming channel");

        String result = strs.stream()
                .filter(str -> str.length() > 10)
                .reduce("", (a, b) -> a + " " + b);

        System.out.println(result);
    }
}
