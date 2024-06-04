package in.collections;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {

    public static void main(String[] args) {
//        Set<Integer>  =new Set<>();
        Set<String> names = new HashSet<>();

        System.out.println(names.add("shekhar"));
        System.out.println(names.add("Sanchit"));
        System.out.println(names.add("Raisoni"));
        System.out.println("______________");
        utilify.print(names);
        System.out.println("______________");

        names.add("Raisoni");
        System.out.println("______________");
        utilify.print(names);
    }
}
