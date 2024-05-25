package SecondLecture;

import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int mynum;

        mynum = input.nextInt();
        System.out.println(mynum);

        String name;
        name = input.next();
        System.out.println("The name is : " + name);

        int age;
        age = input.nextInt();
        System.out.println("Enter you age");
        System.out.println("Your age is -> " + age);
    }
}
