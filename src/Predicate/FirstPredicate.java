package Predicate;

import java.util.function.Predicate;

public class FirstPredicate {
    public static void main(String[] args){
        Predicate<Integer> p = i->i>10;
        System.out.println(p.test(150));
        Predicate<Integer> p1 = getIntegerPredicate();
        p1.test(3);
    }

    private static Predicate<Integer> getIntegerPredicate() {
        return i->i<10;
    }
}
