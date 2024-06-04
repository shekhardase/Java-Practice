package in.collections;

import java.util.Collection;

public class utilify {
    public static <E> void print(Collection<E> collection) {
        for (E cal : collection) {
            System.out.print(cal.toString() + " ");
        }
    }
}
