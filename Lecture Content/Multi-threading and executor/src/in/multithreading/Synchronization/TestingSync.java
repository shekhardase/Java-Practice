package in.multithreading.Synchronization;

public class TestingSync {
    public static void main(String[] args) {
        long StartTime = System.currentTimeMillis();

        Counter counter = new Counter();

        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);

        try {
            t1.start();
            t2.start();

            t1.join();
            t2.join();
        } catch (InterruptedException error) {
            System.out.println("Thread interrupted " + error.getMessage());
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Final counter value " + counter.getCount() + " Time taken " + (endTime - StartTime));
    }

}
