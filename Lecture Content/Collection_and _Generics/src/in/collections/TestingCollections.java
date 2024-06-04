package in.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();

        numList.add(10);
        numList.add(11);
        numList.add(12);
        numList.add(3);
        numList.add(19);
        numList.add(1);
        numList.add(6);
        numList.add(17);

        utilify.print(numList);
        System.out.println();
        Collections.sort(numList);
        utilify.print(numList);
        Collections.reverse(numList);
        System.out.println();
        utilify.print(numList);
        System.out.println();
        Collections.shuffle(numList);
        utilify.print(numList);

        System.out.println();
        List<Integer> unmodifiable = Collections.unmodifiableList(numList);
//        unmodifiable.add(00);

        utilify.print(numList);


    }
}
