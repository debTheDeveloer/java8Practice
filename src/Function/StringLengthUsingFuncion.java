package Function;

import java.util.function.Function;

public class StringLengthUsingFuncion {

    public static void main(String[] args){
        Function<String,Integer> f= s->s.length();
        System.out.println("Length of the given string is: "+f.apply("Arka"));
    }
}
