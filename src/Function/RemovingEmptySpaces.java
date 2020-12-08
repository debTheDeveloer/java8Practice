package Function;

import java.util.function.Function;

public class RemovingEmptySpaces {
    private static final String name = "DEBAJYOTI GHATAK ";
    public static void main(String[] args){
        Function<String,String>f = s -> s.replaceAll(" ","" );
        System.out.println("After removing all the spaces the new string is: "+f.apply(name));
    }
}
