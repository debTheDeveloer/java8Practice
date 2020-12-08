package Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortMinMax {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(5);
        al.add(25);
        al.add(3);
        al.add(27);

        System.out.println("Printing the unsorted list "+al);
        List<Integer> al2= al.stream().sorted().collect(Collectors.toList());
        System.out.println("printing the sorte list");
        System.out.println(al2);

        List<Integer> al3 = al.stream().sorted((i1,i2)->{
             if(i1>i2)
                 return -1;
             if(i1<i2)
                 return 1;
             else
                 return 0;
         }).collect(Collectors.toList());

        System.out.println("After customized sorting "+al3);

        int min = al.stream().min((i1,i2)->i1.compareTo(i2)).get();
        int min1 = al.stream().min(Comparator.naturalOrder()).get(); // Calculating min in a different way.
        System.out.println("Minium value is "+min);

        int min3 = al.stream().min((i1,i2)->i2.compareTo(i1)).get();
        System.out.println("Minimum value through a cutomized value"+min3); //Here min means which one arrives first.
    }
}
