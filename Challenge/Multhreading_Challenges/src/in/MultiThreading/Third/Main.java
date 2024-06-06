package in.MultiThreading.Third;

public class Main {


    public static void main(String[] args) {
        ThreadOperator t1 = new ThreadOperator(1);
        ThreadOperator t2 = new ThreadOperator(2);
        ThreadOperator t3 = new ThreadOperator(3);

        try {
            t1.start();
            t1.join();
            t2.start();
            t2.join();
            t3.start();

        } catch (InterruptedException error) {
            System.out.println(error.getMessage());
        }

    }
}
