package in.MultiThreading.Second;

public class ThreadOperate extends Thread {
    private final int threadNumber;

    public ThreadOperate(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello from thread " + threadNumber + " Number ");
        }
    }
}
