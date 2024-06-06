package in.MultiThreading.Second;

public class PrintState {
    public static void main(String[] args) throws InterruptedException {
        ThreadOperate t1 = new ThreadOperate(1);
        ThreadOperate t2 = new ThreadOperate(2);

        // Initial state before start
        System.out.println("Thread t1 state before start: " + t1.getState()); // NEW
        System.out.println("Thread t2 state before start: " + t2.getState()); // NEW

        // Start t1 and check its state
        t1.start();
        System.out.println("Thread t1 state after start: " + t1.getState()); // RUNNABLE

        // Allow some time for t1 to start running
        Thread.sleep(100);
        System.out.println("Thread t1 state while running: " + t1.getState()); // RUNNABLE or TIMED_WAITING if it’s in sleep

        // Wait for t1 to finish
        t1.join();
        System.out.println("Thread t1 state after join: " + t1.getState()); // TERMINATED

        // Check initial state of t2 before starting
        System.out.println("Thread t2 state before start: " + t2.getState()); // NEW

        // Start t2 and check its state
        t2.start();
        System.out.println("Thread t2 state after start: " + t2.getState()); // RUNNABLE

        // Allow some time for t2 to start running
        Thread.sleep(100);
        System.out.println("Thread t2 state while running: " + t2.getState()); // RUNNABLE or TIMED_WAITING if it’s in sleep

        // Wait for t2 to finish
        t2.join();
        System.out.println("Thread t2 state after join: " + t2.getState()); // TERMINATED
    }
}
