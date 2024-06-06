package in.MultiThreading.first;

public class TwoThreads implements Runnable {


    private final int ThreadNumber;

    public TwoThreads(int threadNumber) {
        this.ThreadNumber = threadNumber;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from thread" + ThreadNumber + " Number ");
        }
    }
}
