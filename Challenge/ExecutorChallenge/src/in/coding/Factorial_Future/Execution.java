package in.coding.Factorial_Future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Execution {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Create a fixed thread pool with 4 threads
        ExecutorService service = Executors.newFixedThreadPool(4);

        // Create tasks for computing factorials
        Futures task1 = new Futures(4);
        Futures task2 = new Futures(6);
        Futures task3 = new Futures(7);
        Futures task4 = new Futures(8);

        // Submit tasks to the executor service
        Future<Integer> result1 = service.submit(task1);
        Future<Integer> result2 = service.submit(task2);
        Future<Integer> result3 = service.submit(task3);
        Future<Integer> result4 = service.submit(task4);


        System.out.println("Factorial of 4: " + result1.get());
        System.out.println("Factorial of 6: " + result2.get());
        System.out.println("Factorial of 7: " + result3.get());
        System.out.println("Factorial of 8: " + result4.get());

        service.shutdown();

    }
}
