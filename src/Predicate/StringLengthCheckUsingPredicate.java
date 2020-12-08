package Predicate;

import java.util.function.Predicate;

public class StringLengthCheckUsingPredicate {
    public static void main(String[] args){
        Predicate<String> p = s -> s.length()>5;
        System.out.println(p.test("Arka"));
        System.out.println(p.test("Debajyoti"));

    }
}
