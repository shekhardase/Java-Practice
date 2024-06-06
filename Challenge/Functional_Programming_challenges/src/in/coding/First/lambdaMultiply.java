package in.coding.First;

import java.util.function.BinaryOperator;

public class lambdaMultiply {
    public static void main(String[] args) {
        lambdaMultiply test = new lambdaMultiply();
        BinaryOperator<Integer> multi = (a, b) -> a * b;
        int result = multi.apply(4, 5);
        System.out.println(result);
    }
}
