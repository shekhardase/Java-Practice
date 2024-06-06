package in.multithreading.Executor.Future;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService service = Executors.newFixedThreadPool(10);

        FetechName task1 = new FetechName("Prashant");
        FetechName task2 = new FetechName("Laudu");
        FetechName task3 = new FetechName("asd");

        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task2);
        Future<String> name3 = service.submit(task3);

        System.out.printf("Full name is : %s", name1.get());
        System.out.println();
        System.out.printf("Full name is : %s", name2.get());
        System.out.println();
        System.out.printf("Full name is : %s", name3.get());
        System.out.println();
//        System.out.printf("Full name is : %s" , name1.get());
        service.shutdown();


    }
}

