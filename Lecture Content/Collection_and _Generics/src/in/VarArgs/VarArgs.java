package in.VarArgs;

public class VarArgs {

    public static void main(String[] args) {
        System.out.println(sum(3, 4));
//        System.out.println(sum(new int[]{2, 3, 4, 5, 6, 7, 8, 8}));
        System.out.println(sum(3, 4, 5, 7, 8, 5, 34, 5, 6, 6));
        System.out.println(sum(2,3,35,35,65,67,45));
    }


//    public static int sum(int... b) {
//        int sum = 0;
//        for (int i : b) {
//            sum = sum + i;
//        }
//        return sum;
//    }

    // we can even customize the min parameters


    // here it is now different method that requires atleast two parameters and can accept further with varargs
    public static int sum(int a, int b, int... c) {
        int sum = 0;
        for (int i : c) {
            sum = sum + i;
        }
        return sum;
    }


    //       This same code can be written with varargs to save space for single element
//    public static int sum(int[] a) {
//        int sum = 0;
//        for (int i : a) {
//            sum += i;
//        }
//        return sum;
//    }


    public static int sum(int a, int b) {
        return a + b;
    }

}
