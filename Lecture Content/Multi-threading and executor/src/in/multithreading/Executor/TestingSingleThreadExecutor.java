package in.multithreading.Executor;

import in.multithreading.Runnable.PrintTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingSingleThreadExecutor {
    public static void main(String[] args) throws InterruptedException {
//        ExecutorService service = Executors.newSingleThreadExecutor();
        ExecutorService service= Executors.newFixedThreadPool(4);
        PrintTask task1 = new PrintTask('+');
        PrintTask task2 = new PrintTask('+');
        PrintTask task3 = new PrintTask('+');
        PrintTask task4 = new PrintTask('+');
        service.submit(task1);
        service.submit(task2);
        service.submit(task3);
        service.submit(task4);
        service.shutdown();

        if(!service.awaitTermination(10 , TimeUnit.MICROSECONDS))
        {
            System.out.println("Ended");
            service.shutdownNow();
        }
    }
}


