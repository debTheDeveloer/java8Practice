package Streams;

import org.w3c.dom.ls.LSInput;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UseOfFilterAndMapAndCount {
    public static void main(String[] args){
        ArrayList<Integer>al = new ArrayList();
        al.add(10);
        al.add(11);
        al.add(12);
        al.add(13);
        al.add(14);
        al.add(15);

            List<Integer> fiterList=al.stream().filter(getIntegerPredicate()).collect(Collectors.toList()); //newLsit is not Arralylist. It is List
        System.out.println("Implemented Filter: "+fiterList);


        List<Integer> mapList = al.stream().map(i->i*2).collect(Collectors.toList());
        System.out.println("Implemented Map: "+mapList);

        Long count = al.stream().filter(i->i%2==0).count();
        System.out.println("Total even number elements presents are: "+count);

        System.out.println("Sum of those methods which are divisible by 2");
        System.out.println(al.stream().filter(i->i%2==0).reduce(0,Integer::sum));

        System.out.println("Using filter and forEach");
        al.stream().filter(i->i>12).collect(Collectors.toList()).forEach(i-> System.out.println(i));
        System.out.println("Using only forEach");
        al.stream().filter((i->i%2==0)).forEach(i-> System.out.println(i));
    }

    private static Predicate<Integer> getIntegerPredicate() {
        return i->i%2==0;
    }

}
