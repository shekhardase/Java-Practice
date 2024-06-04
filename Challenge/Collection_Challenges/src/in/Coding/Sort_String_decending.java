package in.Coding;

import java.util.*;

public class Sort_String_decending {

    public List<String> sortDecending(List<String> str) {
        Collections.sort(str, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        });
        return str;
    }

    public static void main(String[] args) {

        List<String> str = new ArrayList<>();

        System.out.println("Enter the number of strings you want to enter in the list:");
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            str.add(input.next());
        }

        Sort_String_decending sort = new Sort_String_decending();
        sort.sortDecending(str);

        System.out.println("Sorted list in descending order:");
        for (String s : str)
        {
            System.out.println(s);
        }
    }
}

