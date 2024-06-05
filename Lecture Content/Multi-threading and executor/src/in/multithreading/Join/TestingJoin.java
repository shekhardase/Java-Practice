package in.multithreading.Join;

import in.multithreading.Runnable.PrintTask;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('@');
        PrintTask p3 = new PrintTask('#');
        Thread t1 = new Thread(p1);
        t1.start();
        t1.join();
        Thread t2 = new Thread(p2);
        t2.start();
        t2.join();
        Thread t3 = new Thread(p3);
        t3.start();
    }
}
