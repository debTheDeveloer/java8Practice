package JavaConceptOFTheDay;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortingHashMapByItsValue {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Arka");
        hashMap.put(2,"Pablo");
        hashMap.put(6,"Rudra");
        hashMap.put(4,"Noel");
        hashMap.put(9,"Rahul");

       Map<Integer,String> sortedMAp = hashMap.entrySet().stream().
                sorted((Map.Entry<Integer,String>o1,Map.Entry<Integer,String>o2)->o2.getValue().compareTo(o1.getValue())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        System.out.println(sortedMAp);

        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(12);
        al.add(13);
        al.add(11);

        al.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(System.out::println);

        //Printing map element in a different way
        sortedMAp.entrySet().stream().forEach(System.out::println);

        //Storing the sorted map in a list
        System.out.println(hashMap.entrySet().
                stream().
                sorted(Map.Entry.comparingByValue()).
                collect(Collectors.toList()));

    }

}
