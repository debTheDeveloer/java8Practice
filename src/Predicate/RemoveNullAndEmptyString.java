package Predicate;

import java.util.Arrays;
import java.util.function.Predicate;

public class RemoveNullAndEmptyString {
    public static void main(String[] args){
    String[] name = {"Arka","Debajyoti",null,"","Sayan"};
    Predicate<String> p = s ->   s==null || s.isEmpty();
    Predicate<String>p1 = s-> s!=null && !s.isEmpty();
        for (String str:name) {
            if (p.negate().test(str)) { //Using negate
                System.out.println(str);
            }
        }
            System.out.println("Doing the same thing in a differenent way");
            for (String str:name) {
                if (p1.test(str)) {
                    System.out.println(str);
                }
            }

        System.out.println("Doing using Stream and Map");
        Arrays.stream(name).filter(s->p1.test(s)).forEach(System.out::println);
    }
}
