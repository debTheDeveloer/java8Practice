package Streams;

import java.util.ArrayList;

public class MinMaxOfList {
    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList();
        al.add(5);
        al.add(15);
        al.add(7);
        al.add(3);
        al.add(11);
        al.add(25);


        int min = al.stream().min(Integer::compareTo).get();
        System.out.println("Miniuim value of the list is: "+min);

        int max = al.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("Maximum value of the list is: "+max);

        int max2 = al.stream().max(Integer::compareTo).get();
        System.out.println(max2);
    }
}
