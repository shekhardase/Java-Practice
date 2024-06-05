package in.multithreading.Synchronization;

public class UpdaterThread extends Thread {
    private Counter counter;

    public UpdaterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            counter.increment();
        }
    }
}
