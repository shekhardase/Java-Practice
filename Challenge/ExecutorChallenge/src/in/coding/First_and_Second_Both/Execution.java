package in.coding.First_and_Second_Both;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Execution {

    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(8);
        Task task1 = new Task(1);
        Task task2 = new Task(2);
        Task task3 = new Task(3);
        Task task4 = new Task(4);
        Task task5 = new Task(5);
        Task task6 = new Task(6);
        Task task7 = new Task(7);
        Task task8 = new Task(8);

        List<Task> tasks = Arrays.asList(task1, task2, task3, task4, task5, task6, task7, task8);

        // Iterate over the list and submit each task to the executor
        for (Task task : tasks) {
            service.submit(task);
        }

        // Initiate an orderly shutdown of the executor
        service.shutdown();

        try {
            // Wait for all tasks to complete or timeout after 60 seconds
            if (!service.awaitTermination(60, TimeUnit.SECONDS)) {
                // Force shutdown if tasks are not finished
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            service.shutdownNow();
        }

        System.out.println("All tasks have completed.");
    }
}
