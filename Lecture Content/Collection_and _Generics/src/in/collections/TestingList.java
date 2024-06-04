package in.collections;

import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {

        List<String> strList = new ArrayList<>();
        strList.add("1");
        strList.add("1");
        strList.add("1");
        strList.add("1");
        strList.add("1");

        System.out.println(strList.get(0));

        if (strList.contains("1")) {
            System.out.println("one is present");
        }
        strList.remove(2);     // index parameter

        for (String s : strList) {
            System.out.print(s);
        }
    }
}
