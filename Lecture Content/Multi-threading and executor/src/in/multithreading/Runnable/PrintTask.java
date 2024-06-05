package in.multithreading.Runnable;

public class PrintTask implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(targetchar + " ");
        }
        System.out.println();
        System.out.println("first task done");
        System.out.println("Task done" + Thread.currentThread().getName());
    }

    private final char targetchar;

    public PrintTask(char targetchar) {
        this.targetchar = targetchar;
    }
}
