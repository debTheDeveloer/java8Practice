package TwoArgumentFunctionalInterface;

import java.util.function.BiPredicate;

public class BiPredicateExample {
    public static void main(String[] args){
        BiPredicate<Integer,Integer> bp = (a, b)->(a+b)%2==0;
        System.out.println("Sum of 2 numbers iseven? "+bp.test(10,20));
        System.out.println("Sum of 2 numbers iseven? "+bp.test(15,20));
    }
}
