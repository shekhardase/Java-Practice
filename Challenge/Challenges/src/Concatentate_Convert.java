public class Concatentate_Convert {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "New";

        String str3 = new String(str1 + str2);
        System.out.println(str3.toUpperCase());
    }
}
