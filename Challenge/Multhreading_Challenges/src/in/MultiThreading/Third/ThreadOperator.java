package in.MultiThreading.Third;

public class ThreadOperator extends Thread {
    private final int Threadnumber;

    public ThreadOperator(int threadnumber) {
        Threadnumber = threadnumber;
    }


    @Override
    public void run() {
        System.out.println("Thread Running " + Threadnumber);
        System.out.println();
        for (int i = 0; i < 1000; i++) {
            System.out.print(i);
        }
        System.out.println();
        System.out.println("Thread " + Threadnumber + " Processing Ends");
        System.out.println();
    }
}
