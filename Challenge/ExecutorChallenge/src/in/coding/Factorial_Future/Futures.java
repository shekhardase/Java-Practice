package in.coding.Factorial_Future;

import java.util.concurrent.Callable;

public class Futures implements Callable<Integer> {

    private final int number;

    public Futures(int number) {
        this.number = number;
    }

    @Override
    public Integer call() throws Exception {
        return factorial(number);
    }

    private Integer factorial(int num) {
        if (num <= 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
