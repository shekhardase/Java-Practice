// import java.util.Scanner; // Import the Scanner class

class Loops {
    public static void main(String[] args) {
        int n = 5;
        int count = 1;
        do {
            count = count * n;
            n--;
        } while (n != 0);
        System.out.println(count);
    }
}