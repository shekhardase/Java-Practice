public class Fahrenheit_Celsius {
    public static void main(String[] args) {
        System.out.println("Enter temp in degrees");
        int temp = new java.util.Scanner(System.in).nextInt();
        System.out.println(temp + " degrees Fahrenheit is " + (temp - 32) * 5 / 9 + " degrees Celsius");
    }
}
