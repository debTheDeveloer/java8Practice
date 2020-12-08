package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

public class ApplyToArrayAndStreamOf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList();
        al.add("Arka");
        al.add("Debajyoti");
        al.add("Ram");
        al.add("Shyam");

        String[] intArray = al.stream().toArray(String[]::new);
        for (String x:intArray) {
            System.out.println(x);
        }

        System.out.println("Printing using for each");
        Arrays.stream(intArray).forEach(System.out::println);
        //Using Stream.of
        System.out.println("---------------------");
        System.out.println("Applying Stream.of");
        Stream<String> st = Stream.of(intArray);
        st.forEach(System.out::println);

    }
}
