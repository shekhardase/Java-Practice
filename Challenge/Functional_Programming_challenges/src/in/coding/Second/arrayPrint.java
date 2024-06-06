package in.coding.Second;

import java.util.List;

//in.coding.Second.arrayPrint

public class arrayPrint {
    public static void main(String[] args) {
        List<String> al = List.of("Anshul Aggarwal");

        // Populating the ArrayList with custom elements
//        al.add();
//        al.add("Mayank Solanki");
//        al.add("Abhishek Kelenia");
//        al.add("Vivek Gupta");

        // Filter strings with length less than 10 and print them directly
        al.stream()
                .filter(all -> all.length() < 10)
//                .forEach(System.out::println);
                .forEach(System.out::println);
    }
}
