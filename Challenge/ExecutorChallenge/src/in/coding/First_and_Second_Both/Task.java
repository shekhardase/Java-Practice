package in.coding.First_and_Second_Both;

public class Task extends Thread {

    private final int number;

    public Task(int number) {
        this.number = number;
    }

    @Override
    public void run() {
        System.out.println("Thread started Execution" + number);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Thread done execution" + number);
    }
}
