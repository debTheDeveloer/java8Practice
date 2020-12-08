package PeekAndSkip;


import java.util.Arrays;
import java.util.List;

public class PeekAndSkipUSe {
    public static void main(String[] args){
        List<String> stringList = Arrays.asList("Arka","Debajyoti","Ram","Shyam");
        stringList.stream().filter(s -> !s.startsWith("A")).forEach(System.out::println);
        //Applying Peek
        System.out.println("---------------------------");
        stringList.stream().peek(s-> System.out.println("peeked "+s)).filter(s -> !s.startsWith("A")).
                forEach(s-> System.out.println("Filteret strings are: "+s));

        //Applying SKIP
        List<Integer> intList = Arrays.asList(2,3,45,6,7,8,9);
        intList.stream().filter(i->i>3).skip(2).forEach(System.out::println);
        System.out.println("------------------------------------------");
        intList.stream().skip(3).filter(i->i>7).forEach(System.out::println);
    }
}
