package Function;

import java.util.function.Function;

public class Identity {
    public static void main(String[] args){
        Function<String,String>f = Function.identity();
        System.out.println("Applying Identity method");
        System.out.println(f.apply("Debajyoti"));
    }
}
