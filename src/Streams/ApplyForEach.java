package Streams;

import java.util.ArrayList;

public class ApplyForEach {
    public static void main(String[] args){
        ArrayList<String> al = new ArrayList();
        al.add("Arka");
        al.add("Debajyoti");
        al.add("Ram");
        al.add("Shyam");

        al.stream().forEach(s-> System.out.println(s));
        System.out.println("---------------------------");
        al.stream().forEach(System.out::println);
    }
}

