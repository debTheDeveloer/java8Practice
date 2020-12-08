package Predicate;

import java.util.function.Predicate;

public class PredicateJoining {
    public static void main(String[] args) {
        int[] x = {0, 5, 10, 15, 20, 25, 30, 40};
        Predicate<Integer> p1 = i -> i % 2 == 0;
        Predicate<Integer> p2 = i -> i > 10;
        Predicate<Integer> p3 = i -> i%2==0 && i<30;
        System.out.println("Even numbers are: ");
        usePredicate(p1, x);
        System.out.println("Numbers greater than 10 are: ");
        usePredicate(p2,x);
        System.out.println("Numbers following both the queries are: ");
        usePredicate(p1.and(p2),x);
        System.out.println("Numbers following any one of the 2 queries are: ");
        usePredicate(p1.or(p2),x);
        System.out.println("Numbers which are not greater than 10 are: ");
        usePredicate(p2.negate(),x);
        System.out.println("Numbers which are even and less than 30 are: ");
        usePredicate(p3,x);
    }

    private static void usePredicate(Predicate<Integer> p, int[] x) {
        for (int num:x) {
            if(p.test(num))
                System.out.print(num+" ");
        }
        System.out.println("");
    }
}
