package in.multithreading.ThreadClass;

public class FirstTask extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("first task done");
        System.out.println();
        System.out.println("---------" + Thread.currentThread().getName() + "------------------");
        System.out.println();
    }
}