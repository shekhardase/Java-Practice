package in.multithreading;

import in.multithreading.Runnable.PrintTask;

public class TestingPriorityThreading {

    public static void main(String[] args) {
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('@');
        PrintTask p3 = new PrintTask('#');
//        System.err.println(t1);
        Thread t1 = new Thread(p1);
        t1.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        Thread t2 = new Thread(p2);
        t2.setPriority(Thread.NORM_PRIORITY);
        t2.start();
        Thread t3 = new Thread(p3);
        t3.setPriority(Thread.MAX_PRIORITY);
        t3.start();
    }
}
