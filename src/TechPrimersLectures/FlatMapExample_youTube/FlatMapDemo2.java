package TechPrimersLectures.FlatMapExample_youTube;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {
    public static void main(String[] args){
        List<String> l1 = Arrays.asList("a1","b1","c1");
        List<String> l2 = Arrays.asList("a2","b2","c2");
        List<String> l3 = Arrays.asList("a3","b3","c3");

        List<List<String>> names = Arrays.asList(l1,l2,l3);
        System.out.println("Elements in lists are: ");
        System.out.println(names);
        System.out.println("Printing the stream :");
        System.out.println(names.stream());
        System.out.println("Elements inside the stream is: ");
        names.stream().forEach(System.out::println);
        System.out.println("Performing flatmap");
        names.stream().flatMap(l->l.stream()).forEach(System.out::println);//Flat map is taking list<T> as input
                                                                            // and returing it as a stream.
        List<String>flatMApString = names.stream().flatMap(l->l.stream()).collect(Collectors.toList());


    }
}
