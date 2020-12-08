package Function;

import java.util.function.Function;

public class SquareUsingFunction {
    public static void main(String[] args){
        Function<Integer,Integer>f = n->n*n;
        System.out.println("Sqaure of the number is: "+f.apply(5));
    }
}
