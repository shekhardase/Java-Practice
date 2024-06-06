package in.multithreading.Executor.Future;

import java.util.concurrent.Callable;

public class FetechName implements Callable<String> {

    private final String name;

    public FetechName(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.println("Getting names from server");
        System.out.println();
        Thread.sleep(5000);
        return name + " laudu ";

    }

}
