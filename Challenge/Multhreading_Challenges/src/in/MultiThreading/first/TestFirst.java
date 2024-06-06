package in.MultiThreading.first;

public class TestFirst {
    public static void main(String[] args) {


        // thread creation
        TwoThreads t1 = new TwoThreads(1);
        TwoThreads t2 = new TwoThreads(2);

        // thread execution
        Thread r1 = new Thread(t1);
        r1.start();
        Thread r2 = new Thread(t2);
        r2.start();

    }
}
