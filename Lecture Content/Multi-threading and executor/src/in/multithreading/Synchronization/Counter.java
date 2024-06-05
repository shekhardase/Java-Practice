package in.multithreading.Synchronization;

public class Counter {
//    private Counter count;

    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
