package JavaConceptOFTheDay;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByItsValue {
    public static void main(String[] args) {
        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(1,"Arka");
        hashMap.put(5,"Pablo");
        hashMap.put(3,"Rudra");
        hashMap.put(4,"Noel");
        hashMap.put(9,"Rahul");

       Map<Integer,String> map = hashMap.entrySet().stream().
                sorted(Map.Entry.comparingByKey()).
                collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));

        System.out.println(map);

    }
}
