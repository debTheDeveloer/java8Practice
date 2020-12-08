package Function;

import java.util.function.Function;

public class FunctionChaining {
    private static final String name="AishariyaAbhi";
    private static final int number =5;
    public static void main(String[] args){
        Function<String,String> f1 = s -> s.toUpperCase();
        Function<String,String> f2 = s -> s.substring(0,9);
        System.out.println(f1.andThen(f2).apply(name)); //First f1 is applying and then f2.
        System.out.println(f1.compose(f2).apply(name)); //First f2 is applying and then f1.

        Function<Integer,Integer>f3 = i->i+i;
        Function<Integer,Integer>f4 = i->i*i;
        System.out.println("We can see the differecne between andThen and compose");
        System.out.println(f3.andThen(f4).apply(number)); //100
        System.out.println(f3.compose(f4).apply(number)); //50

    }

}
