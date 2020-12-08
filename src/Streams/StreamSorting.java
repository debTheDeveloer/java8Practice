package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSorting {
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList();
        al.add(5);
        al.add(15);
        al.add(7);
        al.add(3);
        al.add(11);
        al.add(25);

        //Defalult Sorting in ascending order.
        List<Integer> sortedList = al.stream().sorted().collect(Collectors.toList());
        System.out.println("List before sorting: "+al);
        System.out.println("List after sorting: "+sortedList);
        //Customized Sorting in ascending order.
        List<Integer>customizedSortedList = new ArrayList();
        customizedSortedList = al.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("List before sorting: "+al);
        System.out.println("List after customize sorting: "+customizedSortedList);
        }
}
