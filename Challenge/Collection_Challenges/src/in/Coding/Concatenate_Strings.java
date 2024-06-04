package in.Coding;

import java.util.Scanner;

public class Concatenate_Strings {

    public static String concatenate(String... strings) {
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(concatenate("input", "we", "we"));
        System.out.println(concatenate("we", "we", "we"));
    }

}
