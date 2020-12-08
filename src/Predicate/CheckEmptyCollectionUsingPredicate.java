package Predicate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class CheckEmptyCollectionUsingPredicate {
    public static void main(String[] args){
        Predicate<Collection> p = c->c.isEmpty();
        ArrayList al = new ArrayList();
        al.add("Arka");
        al.add(100);
        System.out.println(p.test(al));
    }
}
