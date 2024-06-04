package in.Coding.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Country_Capital {


    public static void main(String[] args) {
        System.out.println("Enter the size of map");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        Map<String, String> mp = new HashMap<>(n);

        for (int i = 0; i < n; i++) {
//            mp.keySet() = Collections.singleton(input.next());
            mp.put(input.next(), input.next());
        }

        for (int i = 0; i < n; i++) {
            System.out.println(mp.keySet());
        }
    }
}
