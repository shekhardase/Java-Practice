package in.multithreading.ThreadClass;

public class SecondTask extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.print("# " + " ");
        }
        System.out.println();
        System.out.println("second task done");
    }
}
